package Inheritance;

public class SingleInheritance extends ParentClass{

		 public void Method2() {
			 
			 System.out.println("Single_Inheritance: Child class method");

			}
		 
		 public static void main(String[] args) {
			
			 SingleInheritance si = new SingleInheritance();
			 si.Method1();
			 si.Method2();
			 
		}
}
