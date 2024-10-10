package ques1;

class Emp {
	String name="Pournima";
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	int id=20;
	int salary=250000;
	String address="Borivali";
	
	
	
}

public class Main {
  public static void main(String[] args) {
	Emp emp= new Emp();
	System.out.println(emp.toString());
	
		}
}