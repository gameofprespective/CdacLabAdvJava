package training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.demo.dao.ProductDao;
import training.demo.model.OrderProduct;
import training.demo.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	

	
	public List<Product> displayAll() {
		
		return productDao.displayAll();
	}

	public Product getById(int pid) {
		
		return productDao.getById(pid);
	}

	public int getByproduct1(int pid, String pname, int price, int oquantity, int quantity) {
		Product q=productDao.getById(pid);
		int z = 0;
		if(q!=null)
		{
			if(q.getPid()==pid && q.getPname().equals(pname))
			{
				if(q.getAvailableqty()>quantity)
			 {
					 z=q.getAvailableqty()-quantity;
					 int s=productDao.upDate(pid,pname,price,z);
					 return 1;
			 }
				else
				return 0;
			 
			}
			else
			{
				return 0;
			}
		}
		return 0;
	}

	public Product createProduct(int pid, String pname, int price, int quantity) {
		return new Product(pid,pname,price,quantity);
	}


	public int addOrder(OrderProduct oprod) {
		return productDao.addOrder(oprod);
	}

	public int addProduct(Product p) {
		return productDao.addProduct(p);
	}

	

	
	
}
