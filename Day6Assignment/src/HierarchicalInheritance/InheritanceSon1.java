package HierarchicalInheritance;

public class InheritanceSon1 extends FatherClass{


	public void Son1() {
		
		System.out.println("Son 1 class name");
	
	}
	public static void main(String[] args) {
		
		InheritanceSon1 is = new InheritanceSon1();
		is.Father();
		is.Son1();
	}
}
