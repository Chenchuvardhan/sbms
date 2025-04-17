package in.sulzon.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableWebSecurity
public class MsgController {
@GetMapping("/welcome")
public String welcome() {
	return "Welcome to Jadadevi";
}
}
