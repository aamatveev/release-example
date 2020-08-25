package xyz.matve.releaseexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReleaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReleaseExampleApplication.class, args);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity test() {
		return ResponseEntity.ok("Hello");
	}

}
