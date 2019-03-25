package oops;

//import org.graalvm.compiler.lir.aarch64.AArch64ArithmeticOp.ExtendedAddShiftOp;

class S{
	static int Sa;
	final static int Sb=2;
	private int Sc;
	private static int Sd;
	private final static int Se=4;
	public int getSc() {
		return Sc;
	}
	public void setSc(int sc) {
		Sc = sc;
	}
	public static int getSd() {
		return Sd;
	}
	public static void setSd(int sd) {
		Sd = sd;
	}
	public static int getSe() {
		return Se;
	}
	
}
abstract class SA{
	int SAa;
	int SAb;
    static int SAc=2;
	abstract void SAshow();
}
class abstractUSe extends SA{
   public abstractUSe() {
    System.out.println("In abstact use constructor...");
    this.SAshow();
   }
	@Override
	void SAshow() {
     System.out.println("In Drived Abstract Class...."+this.SAa+ "  "+ this.SAb+" "+this.SAc+ " Using class virtual name "+ abstractUSe.SAc );		
	}
	
}

public class StaticFinalAbstractUse extends S{ 
public static void main(String[] args) {
	S s = new S();
	System.out.println(s.Sa);
	System.out.println(s.Sb);
	System.out.println(s.getSc());
	System.out.println(s.getSd());
	System.out.println(s.getSe());
	abstractUSe au =  new abstractUSe();
	
	
	
}
	 

}
