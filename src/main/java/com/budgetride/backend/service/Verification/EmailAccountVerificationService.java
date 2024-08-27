package com.budgetride.backend.service.Verification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.budgetride.backend.utils.VerificationUtils;

@Service
public class EmailAccountVerificationService {

    private final JavaMailSender mailSender;
    //TODO refactor packages and clean with Maven
    @Autowired
    public EmailAccountVerificationService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public int sendEmail(String recipient) {
        SimpleMailMessage message = new SimpleMailMessage();
        int verificationCode = VerificationUtils.getVerificationCode();
        message.setTo(recipient);
        message.setSubject("Verification Code");
        message.setText("Your verification code is: " + verificationCode);
        mailSender.send(message);
        return verificationCode;
    }
}