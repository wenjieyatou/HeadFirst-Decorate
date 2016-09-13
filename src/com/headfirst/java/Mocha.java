package com.headfirst.java;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage)
	
	{
		
		this.beverage = beverage;
		
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ",  Mocha";
	}

	public double cost() {
		// TODO Auto-generated method stub
		return 0.2 + beverage.cost();
	}
	  
	
	
	
}
