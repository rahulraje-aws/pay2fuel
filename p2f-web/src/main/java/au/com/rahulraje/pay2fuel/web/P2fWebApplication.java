package au.com.rahulraje.pay2fuel.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages="au.com.rahulraje.pay2fuel.web")
@EnableAutoConfiguration
@Configuration
@EnableOAuth2Sso
@RestController
public class P2fWebApplication extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(P2fWebApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(P2fWebApplication.class, args);
	}

	@RequestMapping(value="/status", method=RequestMethod.GET)
    public Message statusMessage() {
        return new Message("OK");
    }

	public static class Message {
		 
	    String status;
	 
	    public Message(String status) {
	        this.status = status;
	    }
	 
	    public String getStatus() {
	        return status;
	    }
	 
	}
}


