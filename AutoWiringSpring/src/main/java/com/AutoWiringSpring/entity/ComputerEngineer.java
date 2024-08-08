package com.AutoWiringSpring.entity;

public class ComputerEngineer {
	Engineer e;

	public ComputerEngineer(Engineer e) {
		super();
		this.e = e;
	}
	
	void print() {
		System.out.println("this is Computer Engineer print method");
	}
}
