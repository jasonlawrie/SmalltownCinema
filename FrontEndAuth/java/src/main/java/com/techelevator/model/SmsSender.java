package com.techelevator.model;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
public class SmsSender {

	    // Find your Account Sid and Token at twilio.com/console
	    // DANGER! This is insecure. See http://twil.io/secure
	    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	    public static final String AUTH_TOKEN = "your_auth_token";

	    public static void main(String[] args) {
	        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        Message message = Message.creator(
	                new com.twilio.type.PhoneNumber("+15558675310"),
	                new com.twilio.type.PhoneNumber("+15017122661"),
	                "This is the ship that made the Kessel Run in fourteen parsecs?")
	            .create();

	        System.out.println(message.getSid());
	    }
	}

