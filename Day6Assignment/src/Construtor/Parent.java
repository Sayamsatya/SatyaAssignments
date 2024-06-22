package Construtor;

public class Parent {

	 public Parent() {
	    	
	        System.out.println("Parent default constructor");
	    }

	    public Parent(int a) {
	        this();
	        System.out.println("Parent one parameterized constructor");
	    }

	    public Parent(int a, int b) {
	        this(12);
	        System.out.println("Parent two parameterized constructor");
	    }

	    public Parent(int a, int b, int c) {
	        this(12, 13);
	        System.out.println("Parent three parameterized constructor");
	    }
}
