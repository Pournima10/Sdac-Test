package overloading;

class Emp{
	double calsal(double sal,double bonus) {
		
		return sal+bonus;
		
	}
	double calsal(double sal,double bonus, double tax) {
		
		return sal+bonus-tax;
		
	}
}
class account extends Emp{
	
double calsal(double sal,double bonus, double tax) {
		
		return sal+bonus-tax;
		
	}
	
	
	
}

public class Main {
	public static void main(String[] args) {
		
		account acc=new account();
		System.out.println(acc.calsal(10000, 4000));
		System.out.println(acc.calsal(10000, 2000,550));
		
	
		
	}
	
	
}
