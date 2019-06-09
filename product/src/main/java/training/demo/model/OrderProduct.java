package training.demo.model;

public class OrderProduct
{
	private int  pid;
	private String pname;
	private int price;
	private int availableqty;
	private int availableqty1;
	private int phoneno;
	public OrderProduct() {
		super();
	}
	public OrderProduct(int pid, String pname, int price, int availableqty, int availableqty1, int phoneno) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.availableqty = availableqty;
		this.availableqty1 = availableqty1;
		this.phoneno = phoneno;
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
	public int getAvailableqty1() {
		return availableqty1;
	}
	public void setAvailableqty1(int availableqty1) {
		this.availableqty1 = availableqty1;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "OrderProduct [pid=" + pid + ", pname=" + pname + ", price=" + price + ", availableqty=" + availableqty
				+ ", availableqty1=" + availableqty1 + ", phoneno=" + phoneno + "]";
	}
	
	
}
