package training.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("100")
    private int aid;
	@Value("Pune")
    private String city;
	@Value("411002")
    private String zipcode;
	public Address() {
		super();
		System.out.println("Address default constructor");
	}
	public Address(int aid, String city, String zipcode) {
		super();
		this.aid = aid;
		this.city = city;
		this.zipcode = zipcode;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
    
}
