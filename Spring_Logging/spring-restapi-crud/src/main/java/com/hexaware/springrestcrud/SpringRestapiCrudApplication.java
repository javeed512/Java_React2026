package com.hexaware.springrestcrud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestapiCrudApplication {

	public static void main(String[] args) {
		
		Logger  log =  LoggerFactory.getLogger(SpringRestapiCrudApplication.class);	
		
			log.info("main() started your application");
		
		
		SpringApplication.run(SpringRestapiCrudApplication.class, args);
		
		
		log.info("application terminated..");
	}

}
