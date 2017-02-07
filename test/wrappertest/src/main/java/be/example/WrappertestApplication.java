package be.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class WrappertestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WrappertestApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
}
