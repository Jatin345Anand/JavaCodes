package crudCollections;

import java.util.HashMap;
import java.util.TreeSet;

public class Customer {
public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
private int id;
private String name;
private double balance;
private HashMap<String, TreeSet<Address>> addressMap;
private HashMap<Integer, Order> orderMap;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public HashMap<String, TreeSet<Address>> getAddressMap() {
	return addressMap;
}
public void setAddressMap(HashMap<String, TreeSet<Address>> addressMap) {
	this.addressMap = addressMap;
}
public HashMap<Integer, Order> getOrderMap() {
	return orderMap;
}
public void setOrderMap(HashMap<Integer, Order> orderMap) {
	this.orderMap = orderMap;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", balance=" + balance + ", addressMap=" + addressMap
			+ ", orderMap=" + orderMap + "]";
}

}
