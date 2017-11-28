package com.pds.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.pds.cursomc.domain.Cliente;
import com.pds.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
