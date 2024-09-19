package com.budgetride.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.budgetride.backend.service.Verification.SMSAccountVerificationService;

@RestController
@CrossOrigin(origins = "https://budgetridefrontend-411512cf02d1.herokuapp.com/")
public class SMSVerificationController {
    
    private final SMSAccountVerificationService smsService;
    
    @Autowired
    public SMSVerificationController(SMSAccountVerificationService smsService) {
        this.smsService = smsService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/account/verification_text/{phoneNumber}", produces = "application/json")
    public int sendVerificationText(@PathVariable String phoneNumber) {
        return smsService.launchTwilio(phoneNumber);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/account/phonevalidation/{phoneNumber}", produces = "application/json")
    public boolean isValidPhoneNumber(@PathVariable String phoneNumber) {
        return smsService.isValidPhoneNumber(phoneNumber);
    }
    
}