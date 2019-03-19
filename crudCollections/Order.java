package crudCollections;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {
public Order(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
//		this.products = products;
	}
private int id;
private String name;
private Date date;
private ArrayList<Product> products = new ArrayList<>();
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
public String getDate() {
	DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
	return df.format(date);
}
public void setDate(Date date) {
	this.date = date;
}
public ArrayList<Product> getProducts() {
	return products;
}
public void setProducts(ArrayList<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Order [id=" + id + ", name=" + name + ", date=" + date + "]";
}

}
