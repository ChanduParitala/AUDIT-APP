package com.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 
 * @author Prakash  
 * This is the application class for JwtAuthentication Micro-service
 * @
 */
@SpringBootApplication
public class AuditAuthorizationApplication {
	
	public static final void  main(String[] args) {
		/**
	     * Main Method- SpringBoot main method to launch an application.
	     */
		SpringApplication.run(AuditAuthorizationApplication.class, args);
		
	}

}
