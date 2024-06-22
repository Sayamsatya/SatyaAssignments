package Inheritance;

public class MultiLevelInheritance extends SingleInheritance {

	public void Method3() {
		
		System.out.println("Multi Level Inheritance: Child and Parent Class");
	}
	
	public static void main(String[] args) {
		
		MultiLevelInheritance ml = new MultiLevelInheritance();
		ml.Method1();
		ml.Method2();
		ml.Method3();
	}
}
