package training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	private static Connection con;
	private static PreparedStatement pst;
	static {
		con=DBUtil.getMyConnection();
		try {
			pst=con.prepareStatement("select uname,password,role from users where uname=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet checkAuthentication(String nm, String ps) throws SQLException {
		pst.setString(1, nm);
		pst.setString(2, ps);
		return pst.executeQuery();
		
	}
	
	
	

}
