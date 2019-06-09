package training.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import training.demo.model.Customer;
import training.demo.service.CustomerService;

@Controller
public class CustomerController 
{
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping("/show")
	public ModelAndView Insert()
	{
		return new ModelAndView("insert","command",new Object());
	}
	
	@RequestMapping("/display")
	public ModelAndView Display(@RequestParam("cd")int cd,@RequestParam("cn")String cn,@RequestParam("bp")String bp,@RequestParam("op")String op)
	{
		Customer c=new Customer(cd,cn,bp,op);
		customerservice.display(c);
		return new ModelAndView("redirect:/showtable");
	}
	
	@RequestMapping("/showtable")
	public ModelAndView showTable()
	{
		List<Customer>clist=customerservice.showtable();
		return new ModelAndView("displaytable","clist",clist);
	}
	
	@RequestMapping("/delete/{cid}")
	public ModelAndView delete(@PathVariable("cid")int cid)
	{
		customerservice.delete(cid);
		return new ModelAndView("redirect:/showtable");
	}
	
	@RequestMapping("/update/{cust_no}")
	public ModelAndView updatecust(@PathVariable("cust_no") String no)
	{
		List<Customer> clist=customerservice.getbyno(no);
		return new ModelAndView("editform","clist",clist);
	}
	
	@RequestMapping("/tableupdate")
	public ModelAndView updateTable(@RequestParam("cd")int cd,@RequestParam("cn")String cn,@RequestParam("bp")String bp,@RequestParam("op")String op)
	{
		Customer c=new Customer(cd,cn,bp,op);
		customerservice.updateTable(c);
		return new ModelAndView("redirect:/showtable");
		
	}
	
}
