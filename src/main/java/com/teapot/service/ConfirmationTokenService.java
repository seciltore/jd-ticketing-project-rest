package com.teapot.service;

import com.teapot.entity.ConfirmationToken;
import com.teapot.exception.TicketingProjectException;
import org.springframework.mail.SimpleMailMessage;

public interface ConfirmationTokenService {

    ConfirmationToken save(ConfirmationToken confirmationToken);

    void sendEmail(SimpleMailMessage email);

    ConfirmationToken readByToken(String token) throws TicketingProjectException;

    void delete(ConfirmationToken confirmationToken);
}