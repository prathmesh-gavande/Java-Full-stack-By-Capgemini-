package com.AutoWiringSpring.entity;

public class Engineer {
//	Human h;

	Prathmesh p;

	public Engineer() {
		System.out.println("This is Engineer");
	}

	public Prathmesh getP() {
		return p;
	}

	public void setP(Prathmesh p) {
		this.p = p;
	}

	// public Human getH() {
//		return h;
//	}
//
//	public void setH(Human h) {
//		this.h = h;
//	}
	void print() {
		System.out.println("This is print method in Engineer class");
	}

	public void display() {
		print();
//		h.print();
		p.print();
	}
}
