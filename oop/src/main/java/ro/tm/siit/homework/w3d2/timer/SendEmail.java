package ro.tm.siit.homework.w3d2.timer;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person person = new Person("ciprian_foia");
		Time time = new Time();
		System.out.println(person.getName() + " not at work");
		System.out.println("type start to start work ");
		String choice = input.next();
		if (choice.equals("start")) {
			time.startWork();
		}
		input.close();

		final String username = "ciprianfoia@gmail.com";
		final String password = "";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			String to = "ciprianfoia@gmail.com";
			Message message = new MimeMessage(session);
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("Testing email sending");
			message.setText(/*
							 * "Dear Friend," +
							 * "\n\n this an email sent with my java program!" +
							 */"time worked today= " + time.transformTime());

			Transport.send(message);

			System.out.println("sent to " + to);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
