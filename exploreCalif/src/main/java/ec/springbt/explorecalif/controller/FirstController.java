package ec.springbt.explorecalif.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {
	
	@GetMapping
	public String returnHello() {
		return "Hello";
	}
}
