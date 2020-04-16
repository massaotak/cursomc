package com.massao.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.massao.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
