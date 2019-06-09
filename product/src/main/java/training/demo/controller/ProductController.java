package training.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.demo.model.OrderProduct;
import training.demo.model.Product;
import training.demo.service.ProductService;

@Controller
public class ProductController
{

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/show")
	public ModelAndView displayAll()
	{
		List<Product> list=productService.displayAll();
		return new ModelAndView("displayAll","list",list);
	}

	@RequestMapping("/addproduct")
	public String viewperson2() {
		return "addproduct";
	}
	
	@RequestMapping("/addProduct1")
	public ModelAndView addproduct(@RequestParam("pid") int pid,@RequestParam("pname") String pname,
			@RequestParam("price") int price,@RequestParam("availableqty") int quantity) {
		Product p=productService.createProduct(pid,pname,price,quantity);
		int i=productService.addProduct(p);
		return new ModelAndView("redirect:/show");
		
	}
	
	@RequestMapping("/order/{pid}")
	public ModelAndView order(@PathVariable("pid") int pid)
	{
		Product p=productService.getById(pid);
		return new ModelAndView("orderForm","p",p);
	}
	@RequestMapping("/final")
	public ModelAndView orderByObject(@RequestParam("pid") int pid,@RequestParam("pname") String pname,
			@RequestParam("price") int price,@RequestParam("availableqty1") int quantity,
			@RequestParam("availableqty") int oquantity
			,@RequestParam("phoneno") int phoneno)
	{
		OrderProduct oprod=new OrderProduct(pid,pname,price,oquantity,quantity,phoneno);
		int j=productService.addOrder(oprod);
		//System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
		int i=productService.getByproduct1(pid,pname,price,oquantity,quantity);
		
		if(i>0)
		{
			String msg="successful";
			return new ModelAndView("NewFile","msg",msg);
		}
		else
		{
			String msg="unsuccessful";
			return new ModelAndView("NewFile","msg",msg);

		}
		
	}
	
}
