package richardlab21g01project2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Run the web server with: .\gradlew.bat bootRun
 * or: gradle run
 * 
 * This web application is hosted in http://localhost:8888 !!!! 
 */
@SpringBootApplication
public class App 
{
    public static void main(String[] args) {
		SpringApplication.run(App.class, args);        
    }
}