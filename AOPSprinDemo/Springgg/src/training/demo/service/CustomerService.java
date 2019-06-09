package training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.demo.dao.CustomerDao;
import training.demo.model.Customer;

@Service
public class CustomerService
{
	@Autowired
	private CustomerDao customerdao;

	public int display(Customer c) {
		return customerdao.display(c);
		
	}

	

	public List<Customer> showtable() {
		return customerdao.showtable();
		
	}



	public int delete(int cid) 
	{
		return customerdao.delete(cid);
		
	}



	public List<Customer> getbyno(String no) {
		return customerdao.getbyno(no);
		
	}



	public Object updateTable(Customer c)
	{
		return customerdao.updateTable(c);
		
	}
	
}
