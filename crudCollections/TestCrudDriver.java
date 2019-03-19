package crudCollections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class SortByPrice implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return ((Double) o1.getPrice()).compareTo(o2.getPrice());
	}
}

public final class TestCrudDriver {
	public static void main(String[] args) {
		System.out.println("WELCOME TO CRUD APPLICATION OF JAVA");
		String names[] = { "ram", "shayam" };
		TreeMap<Integer, Customer> customerMap = new TreeMap<>();
		for (int i = 1; i <= 2; i++) {
			Customer customer = new Customer(i, names[i - 1], 8000 * i);
			customerMap.put(customer.getId(), customer);
			Address address1 = new Address("Kolkata", "India");
			Address address2 = new Address("Ghaziabad", "India");
			Address address3 = new Address("Delhi", "India");
			TreeSet<Address> OfficeaddressesSet = new TreeSet<>();
			OfficeaddressesSet.add(address1);
			OfficeaddressesSet.add(address2);
			OfficeaddressesSet.add(address3);
			HashMap<String, TreeSet<Address>> customerAddressMap = new HashMap<>();
			customerAddressMap.put("office", OfficeaddressesSet);
			customer.setAddressMap(customerAddressMap);
			Address ResidanceAddress1 = new Address("Meerut", "India");
			Address ResidanceAddress2 = new Address("Modinagar", "India");
			Address ResidanceAddress3 = new Address("Navi Mumbai", "India");
			TreeSet<Address> ResidanceAddressSet = new TreeSet<>();
			ResidanceAddressSet.add(ResidanceAddress1);
			ResidanceAddressSet.add(ResidanceAddress2);
			ResidanceAddressSet.add(ResidanceAddress3);
			customerAddressMap.put("Residance", ResidanceAddressSet);
			// customer.setAddressMap(customerAddressMap); // SET ADDRESS MAP
			// Order
			HashMap<Integer, Order> orederMap = new HashMap<>();
			Order order = new Order(1, "Mobile", new Date());
			// Product
			ArrayList<Product> products = new ArrayList<>();
			products.add(new Product(100, "Apple", 890950));
			products.add(new Product(123, "Samsang", 234565));
			products.add(new Product(132, "LG", 456000));
			// order.setDate(date);
			order.setProducts(products);
			Collections.sort(products, new SortByPrice());
//			Collections.sort(products, new Comparator<Product>() {
//				@Override
//				public int compare(Product o1, Product o2) {
//					return o1.getName().compareToIgnoreCase(o2.getName());
//				}
//			});
//			if(10>2) {
//				Collections.sort(products, (p1,p2)->
//				p1.getName().compareToIgnoreCase(p2.getName())
//						);
//			}
			orederMap.put(order.getId(), order); // First Order...
			Calendar c1 =  Calendar.getInstance();
			c1.set(2019,03,19);
			order = new Order(2,"LED",c1.getTime());
			orederMap .put(order.getId(), order); // Second Order/// Here order is same reference of both key and value of ordermap
            customer.setOrderMap(orederMap); // SET ORDER MAP
		
		}
		System.out.println("Your Customers is   ");
		System.out.println(customerMap);
		Customer FirstCutomer =  customerMap.get(1);
		Order order = FirstCutomer.getOrderMap().get(1);
		ArrayList<Product> products =  order.getProducts();
		System.out.println(products.contains(new Product(123, "Samsang", 234565))?"Found":"Not Found");
		System.out.println("Size of your Searched Customer  products"+ products.size());
		System.out.println("Your finded Customer Products of order  = ");
		products.forEach((p)->{System.out.println(p);});
		
		Customer SecondCutomer =  customerMap.get(2);
		 order = SecondCutomer.getOrderMap().get(2);
		products =  order.getProducts();
		System.out.println(products.contains(new Product(123, "LG", 234565))?"Found":"Not Found");
		System.out.println("First Customer  => "+FirstCutomer);
	    System.out.println("JATIN ANAND".equals("JATIN ANAND"));
		System.out.println( "JATIN ANAND".equals("JATINANAND"));
		System.out.println( "JATIN ANAND".equalsIgnoreCase("JATIN ANAND"));
		System.out.println( "JATIN ANAND".equalsIgnoreCase("JATINANAND"));
}}
// After Run
/*
 * WELCOME TO CRUD APPLICATION OF JAVA
Your Customers is   
{1=Customer [id=1, name=ram, balance=8000.0, addressMap={Residance=[Address [ City = Meerut , Country = India ] 
                                                                  , Address [ City = Modinagar , Country = India ]
                                                                  , Address [ City = Navi Mumbai , Country = India ] ],
                                                         office  = [Address [ City = Delhi , Country = India ]
                                                                  , Address [ City = Ghaziabad , Country = India ]
                                                                  , Address [ City = Kolkata , Country = India ] ]},
                                             orderMap={  1 =  Order [id=1, name=Mobile, date=Tue Mar 19 13:38:33 IST 2019]
                                                       , 2 =  Order [id=2, name=LED, date=Fri Apr 19 13:38:33 IST 2019]
                                                      }
            ],
 2=Customer [id=2, name=shayam, balance=16000.0, addressMap={Residance=[Address [ City = Meerut , Country = India ] 
                                                                      , Address [ City = Modinagar , Country = India ] 
                                                                      , Address [ City = Navi Mumbai , Country = India ] ], 
                                                             office =  [Address [ City = Delhi , Country = India ] 
                                                                      , Address [ City = Ghaziabad , Country = India ] 
                                                                      , Address [ City = Kolkata , Country = India ] ]},
                                                 orderMap={  1 = Order [id=1, name=Mobile, date=Tue Mar 19 13:38:33 IST 2019],
                                                             2=Order [id=2, name=LED, date=Fri Apr 19 13:38:33 IST 2019]
                                                           }
             ]
 }
Found
Size of your Searched Customer  products = 3
Your finded Customer Products of order  = [crudCollections.Product@dfd3711, crudCollections.Product@42d3bd8b, crudCollections.Product@26ba2a48]

Not Found
First Customer  => 
Customer [id=1, name=ram, balance=8000.0, addressMap={Residance=[Address [ City = Meerut , Country = India ] , Address [ City = Modinagar , Country = India ] , Address [ City = Navi Mumbai , Country = India ] ], office=[Address [ City = Delhi , Country = India ] , Address [ City = Ghaziabad , Country = India ] , Address [ City = Kolkata , Country = India ] ]}, orderMap={1=Order [id=1, name=Mobile, date=Tue Mar 19 13:38:33 IST 2019], 2=Order [id=2, name=LED, date=Fri Apr 19 13:38:33 IST 2019]}]
true
false
true
false

 */
