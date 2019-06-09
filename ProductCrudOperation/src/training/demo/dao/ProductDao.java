package training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import traning.demo.model.Product;

public class ProductDao {

	static Connection con=null;
	static PreparedStatement pst=null;
	static PreparedStatement delpst=null; 
	static PreparedStatement addpst=null;
	static PreparedStatement pstById=null;
	static PreparedStatement updatepst=null;
	static{
		try {
			con=DBUtil.getMyConnection();
			pst=con.prepareStatement("select * from product");
			delpst=con.prepareStatement("delete from product where pid=?");
			addpst=con.prepareStatement("insert into product(pid,pname,price) values(?,?,?)");
			pstById=con.prepareStatement("select pid,pname,price from product where pid=?");
			updatepst=con.prepareStatement("update product set pname=?,price=? where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ResultSet getAllProducts() throws SQLException {
		return pst.executeQuery();
		
	}

	public static int deleteProductById(int pid) throws SQLException {
		delpst.setInt(1,pid);
		return delpst.executeUpdate();
		
		
		
		
		
	}

	public static int addProduct(Product p) throws SQLException {
		addpst.setInt(1,p.getPid());
		addpst.setString(2,p.getPname());
		addpst.setDouble(3,p.getPrice());	
		return addpst.executeUpdate();
	
	}

	public static ResultSet getProductById(int pid) throws SQLException {
		pstById.setInt(1,pid);
		return pstById.executeQuery();
		
	
	
	}

	public static int editproduct(Product p) throws SQLException {
		updatepst.setString(1,p.getPname());
		updatepst.setDouble(2, p.getPrice());
		updatepst.setInt(3, p.getPid());
		return updatepst.executeUpdate();
		
	}

}
