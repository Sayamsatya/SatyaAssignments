package Student;

public class Student {

	int age, rollno;
	
	public void display1() {
		
		System.out.println("Welcome to all of you");
		
	}
	
	public void display2() {
		
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.display1();
		stu.display2();
		stu.age=29;
		stu.rollno=11123;
		System.out.println("Age of the student: " +stu.age);
		System.out.println("Roll no of the Student: " +stu.rollno);
	}
}
