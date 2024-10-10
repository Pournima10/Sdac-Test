package com.manager;
import com.acc.Account;

public class Manager extends Account {
	@Override
	public double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus -tax;
	}

}
