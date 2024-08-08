package ComparatorTest;

public class Student {
	private int roll;
	private int name;
	private int age;
	public Student(int roll, int name, int age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public int getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(int name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
