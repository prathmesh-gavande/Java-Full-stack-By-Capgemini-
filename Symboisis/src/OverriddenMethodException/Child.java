package OverriddenMethodException;

import java.io.IOException;

public class Child extends Parent{

	@Override
	void display() throws Exception{
		System.out.print("Child class method");
	}
	public static void main(String[] args) throws Exception{
		Parent p=new Child();
		try {
			p.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Parent p1=new Parent();
//		p1.display();
//		Child c1=new Child();
//		c1.display();
	}

}
