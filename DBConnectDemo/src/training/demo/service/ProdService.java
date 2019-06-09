package training.demo.service;

import training.demo.dao.ProductDao;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdService {
	private static ProductDao pdao;
	static {
		pdao =new ProductDao();
	}


	public static ResultSet getCategories() throws SQLException {
		
		return pdao.getProductCategories();
	}

}
