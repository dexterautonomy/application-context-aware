package com.dexter.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Using @Autowired In A Non Spring Bean", version = "1.0", description = "Using @Autowired In A Non Spring Bean"))
public class AutowireApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowireApplication.class, args);
	}

}
