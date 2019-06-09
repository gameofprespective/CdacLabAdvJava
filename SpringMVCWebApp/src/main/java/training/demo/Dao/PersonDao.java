package training.demo.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import training.demo.model.Person;
@Repository
public class PersonDao {
	@Autowired 
	JdbcTemplate jdbcTemplate;
	public int addPerson(Person p) {
		
		String sql="insert into persontab values(?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {p.getPid(),p.getPname(),p.getMobile()});
		
		 
	}
	public List<Person> getAllPerson() {
		
		String sql="select * from persontab";
		
		 return jdbcTemplate.query(sql, new RowMapper() {public Person mapRow(ResultSet rs, int rownum) throws SQLException{
			Person per=new Person();
			per.setPid(rs.getInt(1));
			per.setPname(rs.getString(2));
			per.setMobile(rs.getString(3));
			return per;
		}});
		
		
	}
	public int deletePerson(int id) {
		
		String sql="delete from persontab where pid=?";
		return jdbcTemplate.update(sql,new Object[] {id});
		 
	}

}
