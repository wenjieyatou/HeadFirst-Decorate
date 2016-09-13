package com.headfirst.java;

public abstract class Beverage {

	String description = "Unkknow Beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
