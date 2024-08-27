package com.budgetride.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.budgetride.backend.service.Verification.EmailAccountVerificationService;

@RestController
public class EmailVerificationController {

    private final EmailAccountVerificationService emailService;
    
    @Autowired
    public EmailVerificationController(EmailAccountVerificationService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/account/verification_email/{emailAddress}", produces = "application/json")
    public int sendVerificationEmail(@PathVariable String emailAddress) {
        return emailService.sendEmail(emailAddress);
    }

}