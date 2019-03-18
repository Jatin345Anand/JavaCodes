package oops;

import java.util.LinkedList;

import oops.P.InnerP;

interface A{
	default void show() {
		System.out.println("In show of A Interface...");
	}
}
interface B{
	default void show() {
		System.out.println("In show of B interface....");
	}
}
interface C extends A,B{
	@Override
	public default void show() {
	 	A.super.show();
	 	B.super.show();
	}
	
}
class D implements C{
	
}
// Outer(can be public and default ) and Inner(can be everything) Class Example
class P{
	int xp=100;
	class InnerP{
		int xIP=200;
		void showIP() {
			System.out.println("In Inner of non static P show..."+this.xIP+" "+xp);
		}
	}
	static class Q{
		static int x=10;
		static void showQ() {
			System.out.println("In Inner static class Q "+x);
		}
	}
	void showP() {
		System.out.println("In Outer calss P...");
	}
}
// Java has multiple inheritace features in interface
// After Java 8 we can define the body of method in interface by using by defualt 
public class Java8InterfaceProperty {
   public static void main(String[] args) {
	D d = new D();
	d.show();
	P p = new P();
	p.showP();
    P.Q.showQ();
    P.InnerP innerP =  new  P().new InnerP();
    innerP.showIP();
    int x=100;
    int y=150;
    Integer i= new Integer(x); // Boxing (Primitive to object)
    Integer j= new Integer(y);
    int z = i.intValue(); // Unboxing///
    Integer k = new Integer(z);
    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(i);
    ll.add(x);
    // in Java 1.4 it does not access ...
    //  Integer z=i this property...
    Integer x1=300;
    Integer y1=400;
    Integer q = x1+y1;
//    Integer q = x; // after Java 1.5
    
}
}
