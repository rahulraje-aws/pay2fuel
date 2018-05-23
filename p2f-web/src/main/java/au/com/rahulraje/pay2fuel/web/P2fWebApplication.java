package au.com.rahulraje.pay2fuel.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@EnableOAuth2Sso
@RestController
public class P2fWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2fWebApplication.class, args);
	}
}
