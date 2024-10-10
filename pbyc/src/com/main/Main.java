package com.main;

 import com.employee.*;
 import com.manager.*;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Manager manager= new Manager();
		
		System.out.println(emp.calsal(100000));
		System.out.println(manager.calsal(200000, 50000));
		System.out.println(manager.calsal(200000, 5000, 4500));
		 
	
	}

}
