package training.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import training.demo.dao.ProductDao;
import traning.demo.model.Product;

public class ProductService {

	public static ResultSet getAllProducts() {
		
		
			try {
				return ProductDao.getAllProducts();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
		
	}

	public static int deleteProductById(int pid) {
		try {
			
			return ProductDao.deleteProductById(pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static int addProduct(Product p) {
		try {
			return ProductDao.addProduct(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
	}

	public static ResultSet getProductById(int pid) {
		try {
			return ProductDao.getProductById(pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public static int editProduct(Product p) {
		try {
			return ProductDao.editproduct(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

}
