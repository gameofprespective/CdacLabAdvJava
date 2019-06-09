package training.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import training.demo.model.OrderProduct;
import training.demo.model.Product;



@Repository
public class ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Product> displayAll() {
		String str="select * from prod";
		return jdbcTemplate.query(str,new RowMapper() {
			public Product mapRow(ResultSet rs,int num) throws SQLException
			{
			   Product p=new Product();
			   p.setPid(rs.getInt(1));
			   p.setPname(rs.getString(2));
			   p.setPrice(rs.getInt(3));
			   p.setAvailableqty(rs.getInt(4));
				return p;	   
			}
		});
	}

	public Product getById(int pid) {
		String str="select * from prod where pid=?";
		System.out.println(str);
		return jdbcTemplate.queryForObject(str, new Object[] {pid},new RowMapper() {
			public Product mapRow(ResultSet rs,int num) throws SQLException
			{
			   Product p=new Product();
			   p.setPid(rs.getInt(1));
			   p.setPname(rs.getString(2));
			   p.setPrice(rs.getInt(3));
			   p.setAvailableqty(rs.getInt(4));
				return p;	   
			}
		});
		
		
	}

	public int upDate(int pid, String pname, int price, int z) {
		String sql="update prod set availableqty=? where pid=?";
		System.out.println(sql);
		return jdbcTemplate.update(sql,new Object[] {z,pid});
	}

	

	public int addProduct(Product p) {
		String str="insert into prod values(?,?,?,?)";
		return jdbcTemplate.update(str,new Object[] {p.getPid(),p.getPname(),p.getPrice(),p.getAvailableqty()});// TODO Auto-generated method stub
		
	}

	public int addOrder(OrderProduct oprod) {
		String str="insert into orderproduct values(?,?,?,?,?,?)";
		return jdbcTemplate.update(str,new Object[] {oprod.getPid(),oprod.getPname()
				,oprod.getPrice(),oprod.getAvailableqty(),oprod.getAvailableqty1(),
				oprod.getPhoneno()});// TODO Auto-generated method stub
		
	}
}
