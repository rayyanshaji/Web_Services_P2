package cs333.project_2.Profile;

import java.util.ArrayList;

public class Buyer implements Profile {
	private String username;
	private String password;
	private String ID;
	private ArrayList<String> orders;
	private Address address;
	
	//Getters and Setters
	//Username
	public String getUsername() {return username;}
	public boolean setUsername(String username) {
		this.username = username;
		return true;
	}
	
	//Password
	public String getPassword() {return password;}
	public boolean setPassword(String password) {
		this.password = password;
		return true;
	}
	
	//ID
	public String getID() {return ID;}
	public void setID(String iD) {ID = iD;}
	
	//ORDERS
	public ArrayList<String> getOrders() {return orders;}
	public void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}
	
	//Address
	public Address getAddress() {return address;}
	public boolean setAddress(Address address) {
		this.address = address;
		return true;
	}
	
	//ADD ORDER - Using the same logic for now of Seller, will make changes soon as required.
	@Override
	public boolean addOrder(String orderID) {
		// TODO Auto-generated method stub
		if(this.orders.size() == 0) {
			this.orders.add(orderID);
			return true;
		}
		
		for(int i = 0; i < this.orders.size(); i++) {
			if(orderID.compareToIgnoreCase(this.orders.get(i)) > 0 && orderID.compareToIgnoreCase(this.orders.get(i + 1)) < 0)
				orders.add(i, orderID);
			if(orderID == this.orders.get(i)) {
				System.err.println("This buyer already has an order with ID: " + orderID);
				return false;
			}
		}
		return true;
	}
	//GENERAL METHODS
	//Authenticate Credentials
	@Override
	public boolean AuthenticateCred(String username, String password) {
		// TODO Auto-generated method stub
		if(this.username == username && this.password == password)
			return true;
		else return false;		
	}

}
