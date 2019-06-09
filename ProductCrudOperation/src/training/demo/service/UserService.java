package training.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import training.demo.dao.UserDao;

public class UserService 
{

	public static boolean validateUser(String uname, String pass) {
		
	ResultSet rs;
	try {
		rs = UserDao.getUser(uname,pass);
	
	
	if(rs.next())
	{
		
			if(rs.getString(1).equals(uname) && rs.getString(2).equals(pass))
			{
				return true;
			}
			else
			{
				return false;
			}
		
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	

}
