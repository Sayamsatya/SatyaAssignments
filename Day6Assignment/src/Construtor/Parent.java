package Construtor;

public class Parent {

	 public Parent() {
		 
		        System.out.println("Parent default constructor");
		    }

		    Parent(int a) {
		        this(); 
		        System.out.println("Parent one parameterized constructor");
		    }

		    Parent(int a, int b) {
		        this(a); 
		        System.out.println("Parent two parameterized constructor");
		    }

		    Parent(int a, int b, int c) {
		        this(a, b);
		        System.out.println("Parent three parameterized constructor");
		    }
}
