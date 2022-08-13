package com.euth.euth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuthApplication.class, args);
	}

}
