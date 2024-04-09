package com.example.mailproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.mailproject.model.MailModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MailService {

	@Autowired
	private JavaMailSender mailSender;

	@Value("${spring.mail.username}")
	private String sender;

	public void sendMail() {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		String receiver = "jyotinarayanmishra05@gmail.com";
		simpleMailMessage.setFrom(sender);
		simpleMailMessage.setSubject("Hello!!");
		simpleMailMessage.setText("This is an Email sent by using Java.");
		simpleMailMessage.setTo(receiver);

		mailSender.send(simpleMailMessage);

	}

}
