package oops;
class Ia{
	int a=10;

	public Ia() {
//		super();
		System.out.println("In cons of Ia....");
//		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
class Ib extends Ia{
    int b=12;
    int c=23;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public Ib() {
		System.out.println("In cons of Ib.....");
 	}
	
	
}
class Ic extends Ib {
	int d=3;
	int e=90;
	private static int f=89;
	public Ic() {
	System.out.println("In cons of Ic...."); 
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public static int getF() {
		return f;
	}
	public static void setF(int f) {
		Ic.f = f;
	}
	
}
class Id extends Ic{
	public Id() {
		System.out.println("In cons main of Id....");
	 Ic ic = new Ic();
	 Ib ib = new Ib();
	 Ia ia = new Ia();
	}
	
}
public class MultilevelInheritance {
public static void main(String[] args) {
	Id id = new Id();
}
}
