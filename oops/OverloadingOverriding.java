package oops;

import java.io.IOException;

class ParentSearch {
	public ParentSearch() {
		// TODO Auto-generated constructor stu
		System.out.println("PArent constructor...");
	}

	void emi() {
		System.out.println("Parent emi...");
	}
}
class E {
	int x, y;
}

class Eplus extends E{
	int z;
	
}
class AA {
	// default scope only their package not outside the package
	int x, y;

	E show() throws IOException {
		System.out.println("In A show....");
		E e = new E();
		e.x = 1234;
		e.y = 4456;
		return e;
	}
}

class BB extends AA {
	// Weaker Access when parent and child method both public _> we can only increase the scoope of childe 's method...
	@Override
    Eplus show() throws IOException {
		// TODO Auto-generated method stub
		// This feature has come after Java 5
		// You must have to define same or small exception in inherited child's method
		super.show();
		System.out.println("In B show...");
		Eplus eplus = new Eplus();
		eplus.x = 2345;
		eplus.y = 3456;
		eplus.z = 4567;
		return eplus;
	}
	// Here child return the more property as compare his parent method show...
    // change the return type (Java 5) (Coveriant return type)
	// I want more then 1 value in return of method
	AA getreturnReferanceValue() {
		AA aa = new AA();
		aa.x = 120;
		aa.y = 234;
		return aa;
	}
}

class Search extends ParentSearch {
	void search(String brandwise) {
		System.out.println("Searching with brand wise....");
	}

	void search(double price) {
		System.out.println("Searching with price wise...");
	}

	void search(String brand, int ramsize) {
		System.out.println("Searching with brand " + brand + "and ram size..." + ramsize);
	}

	Search() {
		System.out.println("In childe constructor....");
	}

	Search(int x) {
		this();
		System.out.println("In parameterized cons....");
	}

	@Override
	void emi() {
		super.emi();
		System.out.println("In Child Search....");
	}
}



public class OverloadingOverriding {
	public static void main(String[] args) throws IOException {
		Search search = new Search(12);
		search.search(1234.56778);
		search.search("Mobile");
		search.search("Electronics", 4);
		search.emi();
		BB b = new BB();
		b.show();
		AA obj = b.getreturnReferanceValue();
//		obj = (AA) obj;
	    System.out.println("AA property = "+obj.x+"  "+obj.y);
		Eplus eplus = b.show();
		System.out.println("Eplus property = "+eplus.x+" "+eplus.y+" "+eplus.z);
		// System.out.println("Return Object = "+obj.toString()+" "+obj);
	}
	// After run
	// PArent constructor...
	// In childe constructor....
	// In parameterized cons....
	// Searching with price wise...
	// Searching with brand wise....
	// Searching with brand Electronicsand ram size...4
	// Parent emi...
	// In Child Search..
	/*
	 * Final run
PArent constructor...
In childe constructor....
In parameterized cons....
Searching with price wise...
Searching with brand wise....
Searching with brand Electronicsand ram size...4
Parent emi...
In Child Search....
In A show....
In B show...
AA property = 120  234
In A show....
In B show...
Eplus property = 2345 3456 4567

	 */
}
