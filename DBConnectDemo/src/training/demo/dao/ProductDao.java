package training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;

public class ProductDao {
    private static Connection con;
    private static PreparedStatement pst;
    static {
    	con=DBUtil.getMyConnection();
    	try {
			pst=con.prepareStatement("select * from category");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	public static ResultSet getProductCategories() throws SQLException {
		
		return pst.executeQuery();
	}

}
