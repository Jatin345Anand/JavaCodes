package oops;

abstract class Account{
	int accountNumber ;
	double balance;
	void withDraw() {
		System.out.println("Account Class Withdraw...");
	}
	void Deposite() {
		System.out.println("Account Class Deposit...");
	}
	abstract void roi() ; 
}
class SavingAccount extends Account{
	@Override
	void Deposite() {
	 	super.Deposite();
	 	System.out.println("In Saving Account Deposite....");
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("In roi saving...");
	}
	
	
}
class CurrentClass extends Account{
	@Override
	void withDraw() {
	 	super.withDraw();
	 	System.out.println("In cuurent account withdraw....");
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("In roi current...");
	}
}
public class InheritanceVsAbstractClass {
public static void main(String[] args) {
	
}
}
