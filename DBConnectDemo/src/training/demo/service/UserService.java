package training.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import training.demo.dao.UserDao;

public class UserService {
	private UserDao udao;

	public UserService() {
		super();
		udao=new UserDao();
	}

	public Boolean validateUser(String nm, String ps) throws SQLException {
		ResultSet rs=udao.checkAuthentication(nm,ps);
		if(rs.next()) {
			if(rs.getString(1).equals(nm) && rs.getString(2).equals(ps)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
		    return false;
		}
		
	}
	

}
