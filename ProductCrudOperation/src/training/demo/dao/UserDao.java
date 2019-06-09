package training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UserDao 
{
	static Connection con=null;
	static PreparedStatement pst=null;
	
	static{
		try {
			con=DBUtil.getMyConnection();
			pst=con.prepareStatement("select uname,password, role from users where uname=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static ResultSet getUser(String uname, String pass) throws SQLException {
		pst.setString(1, uname);
		pst.setString(2, pass);
		return pst.executeQuery();
	}

}
