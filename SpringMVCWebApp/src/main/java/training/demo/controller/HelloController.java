package training.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello1() {
		return "hello";
		
	}
	
	
	@RequestMapping("/hello1")
	public ModelAndView sayHello() {
		String msg="Hello world!";
		return new ModelAndView("welcome","message",msg);
		
	}

}
