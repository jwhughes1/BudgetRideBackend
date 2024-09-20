package com.budgetride.backend.service.Verification;

import org.springframework.stereotype.Service;

import com.budgetride.backend.utils.VerificationUtils;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SMSAccountVerificationService {

  
  private final String ACCOUNT_SID = "ACb8cad1d8fb393201e9a76af81754e8f9";  //TODO copy to constants file
  private final String AUTH_TOKEN = "56b7a86be22ae3234e1c9b37800284b7";
  public int launchTwilio(String toPhoneNumber) {



    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    int verificationCode = VerificationUtils.getVerificationCode();
    
    Message message = Message
      .creator(
        new PhoneNumber(toPhoneNumber),
        new PhoneNumber("+18149850800"),
        "Verification Code is: " + verificationCode
      )
      .create();

    System.out.println(message.getSid());
    return verificationCode;
  }


  public boolean isValidPhoneNumber(String toPhoneNumber) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    com.twilio.rest.lookups.v2.PhoneNumber phoneNumber = com.twilio.rest.lookups.v2.PhoneNumber.fetcher(toPhoneNumber).fetch();
    System.out.println(phoneNumber.getValid());

    return phoneNumber.getValid();

  }
    
}