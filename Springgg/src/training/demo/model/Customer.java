package training.demo.model;

public class Customer 
{
	private int cid;
	private String cust_no; 
	private String basepack;
	private String optionalpack;
	public Customer() 
	{
		super();
	}
	public Customer(int cid, String cust_no, String basepack, String optionalpack)
	{
		super();
		this.cid = cid;
		this.cust_no = cust_no;
		this.basepack = basepack;
		this.optionalpack = optionalpack;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCust_no() {
		return cust_no;
	}
	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}
	public String getBasepack() {
		return basepack;
	}
	public void setBasepack(String basepack) {
		this.basepack = basepack;
	}
	public String getOptionalpack() {
		return optionalpack;
	}
	public void setOptionalpack(String optionalpack) {
		this.optionalpack = optionalpack;
	}
	
	
	
	

}
