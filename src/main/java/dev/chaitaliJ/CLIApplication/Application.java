package dev.chaitaliJ.CLIApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* The main class of the Spring Boot application.
 * This class initializes and starts the Spring application context.
*/ 
@SpringBootApplication
public class Application {

	/**
     * The entry point of the Spring Boot application.
     * This method starts the Spring application context and initializes the application.
     * @param args The command-line arguments passed to the application (not used in this project)
     */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
