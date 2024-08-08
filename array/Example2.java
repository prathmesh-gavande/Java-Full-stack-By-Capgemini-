package com.array;

public class Example2 {

	public static void main(String[] args) {
		Student std[]=new Student[]
				{
						new Student(101,"Parag",67),
						new Student(102,"Ram",47),
						new Student(103,"Yash",98),
						
				};
		
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].roll+" "+std[i].name+" "+std[i].marks);
		}

	}

}
