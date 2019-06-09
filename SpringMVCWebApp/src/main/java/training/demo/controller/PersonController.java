package training.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import training.demo.model.Person;
import training.demo.service.PersonService;

@Controller
//@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/viewPerson")
	public ModelAndView viewAllPerson() {
		List<Person> plist=personService.getAllPerson();
		return new ModelAndView("viewperson","plist",plist);
		
	}
	
	@RequestMapping("/viewform")
	public ModelAndView ShowPersonform() {
		return new ModelAndView("personform","command",new Person());
		
	}
	
	@RequestMapping("/addperson")
	public ModelAndView addPerson(@RequestParam("pid") int id,@RequestParam("pname") String pname,@RequestParam("mobile") String mob) {
		Person p=new Person(id,pname,mob);
		personService.addPerson(p);
		return new ModelAndView("redirect:/viewPerson");
		
	}

}
