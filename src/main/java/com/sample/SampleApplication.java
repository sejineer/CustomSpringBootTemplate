package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:database/application-database.yml"})
@PropertySource(value = { "classpath:oauth2/application-oauth2.yml" })
@PropertySource(value = { "classpath:swagger/application-springdoc.yml" })
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}
