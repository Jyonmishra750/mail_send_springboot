package com.example.mailproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mailproject.model.MailModel;
import com.example.mailproject.service.MailService;

@RestController
@RequestMapping("/sendmail")
public class MailController {

	@Autowired
	private MailService mailService;
	

	@PostMapping("/mail")
	@ResponseStatus(HttpStatus.CREATED)
	@Scheduled(cron = "*/5 * * * * *")
	public void sendMail() throws InterruptedException{
		mailService.sendMail();
	}

}
