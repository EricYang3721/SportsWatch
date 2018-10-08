package se.sportswatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;



@SpringBootApplication
public class SportswatchApplication{

	public static void main(String[] args) {
		SpringApplication.run(SportswatchApplication.class, args);
	}



}
