# Spring Boot Mail Sender

This is a simple Spring Boot application demonstrating how to send emails using JavaMailSender.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java 8 or higher
- Maven
- Spring Boot

## Clone this project
  `https://github.com/Jyonmishra750/mail_send_springboot.git`

## Configuration

  Update the `application.properties`

   ```properties
   spring.mail.host=smtp.example.com
   spring.mail.port=587
   spring.mail.username=your-email@example.com
   spring.mail.password=your-email-password
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true

