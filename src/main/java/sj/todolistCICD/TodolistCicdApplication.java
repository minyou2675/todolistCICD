package sj.todolistCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TodolistCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistCicdApplication.class, args);
	}

}
