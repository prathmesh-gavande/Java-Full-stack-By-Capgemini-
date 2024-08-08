package studenrArray;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std[]=new Student[] 
				{
				new Student(101,"Prathmesh",70.6f),
				new Student(102,"Parag",77.6f),
				new Student(103,"ram",80.6f),
				};
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].roll +" "+ std[i].name+" "+std[i].marks);
		}
	}

}
