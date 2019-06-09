package training.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import training.demo.model.Customer;

@Repository
public class CustomerDao 
{
	@Autowired 
	private JdbcTemplate jdbctemplate;

	public int display(Customer c)
	{
		String sql="insert into custom values(?,?,?,?)";
		return jdbctemplate.update(sql,new Object[] {c.getCid(),c.getCust_no(),c.getBasepack(),c.getOptionalpack()});
	}

	public List<Customer> showtable() 
	{
		String sql="select * from custom";
		return jdbctemplate.query(sql,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				Customer c=new Customer();
				c.setCid(rs.getInt(1));
				c.setCust_no(rs.getString(2));
				c.setBasepack(rs.getString(3));
				c.setOptionalpack(rs.getString(4));
				return c;
			}});
	}

	public int delete(int cid) 
	{
		String sql="delete from custom where cid=?";
		return jdbctemplate.update(sql,new Object[] {cid});
	}

	public List<Customer> getbyno(String no) {
		String sql="select * from custom where cust_no=?";
		return  jdbctemplate.query(sql,new Object[] {no},new RowMapper() {

			@Override
			public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
				Customer c=new Customer();
				c.setCid(rs.getInt(1));
				c.setCust_no(rs.getString(2));
				c.setBasepack(rs.getString(3));
				c.setOptionalpack(rs.getString(4));
				return c;
			}});
	}

	public Object updateTable(Customer c) 
	{
		String sql="update custom set cid=?,basepack=?,optionalpack=? where cust_no=?";
				return jdbctemplate.update(sql,new Object[] {c.getCid(),c.getBasepack(),c.getOptionalpack(),c.getCust_no()});
	}

}
