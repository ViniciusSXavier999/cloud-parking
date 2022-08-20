package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Para o spring reconheça como um end-point rest 
@RestController
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Oi ne";
	}

}
