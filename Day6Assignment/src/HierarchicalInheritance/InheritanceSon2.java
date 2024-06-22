package HierarchicalInheritance;

public class InheritanceSon2 extends FatherClass {

public void Son2() {
		
		System.out.println("Son 2 class name");
	
	}
	public static void main(String[] args) {
		
		InheritanceSon2 is = new InheritanceSon2();
		is.Father();
		is.Son2();
	}

}
