package abs;
 interface Policy{
	 double calsal(double sal, double bonus);
	 
	 
 }
abstract class Company{
	double calsal(double sal, double bonus) {
		return 0;
		
	}
	
}
class Employee extends Company{
	double calsal(double sal, double bonus) {
		return sal+bonus;
		
	}
	
}


public class Main {
	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println(employee.calsal(200000, 50000));
	
	}

}
