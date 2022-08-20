package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import springfox.documentation.annotations.ApiIgnore;

// Para o spring reconheça como um end-point rest 
@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Oi ne";
	}

}
