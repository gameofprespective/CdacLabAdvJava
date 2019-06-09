package training.demo.model;

public class Product
{
	private int  pid;
	private String pname;
	private int price;
	private int availableqty;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int price, int availableqty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.availableqty = availableqty;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableqty() {
		return availableqty;
	}
	public void setAvailableqty(int availableqty) {
		this.availableqty = availableqty;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", availableqty=" + availableqty + "]";
	}
	
	
}
