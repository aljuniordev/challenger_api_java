package br.com.challengeapijava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApiJavaApplication {

	private static final Logger logger = LoggerFactory.getLogger(ChallengeApiJavaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApiJavaApplication.class, args);
	}

}
