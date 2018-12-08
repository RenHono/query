package cn.sinvo.fpp.query.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author RenHono fpp
 * The Security System that Seals the Savage Science Smartly by its Supreme Sagacity and Strength
 */
 
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index(){
		return "Hello World";
	}
}
