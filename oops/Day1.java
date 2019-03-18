package oops;
//Interface -> Prototype Designing of Codes
@FunctionalInterface
// SAM Interface Single Abstract Method Interface

interface Calculator{
	public void calcEmi();
}
class HomeLoan implements Calculator{
	@Override
	public void calcEmi() {
		 System.out.println("In Home loan overired method...");
	}
}
public class Day1 {
public static void main(String[] args) {
	HomeLoan hl =  new HomeLoan();
	// 1st way....
	// this way you used many times...
	hl.calcEmi();
	// 2nd way...
	Calculator calcobj = new Calculator() {
		// this way you used once....
		@Override
		public void calcEmi() {
			// TODO Auto-generated method stub
			System.out.println("In anonymous class of calculator....");
		}
	};
	calcobj.calcEmi();
	// 3rd way....
	Calculator calcobj2 = ()->System.out.println("Called lambda method...");
	calcobj2.calcEmi();
	
	
}
}
