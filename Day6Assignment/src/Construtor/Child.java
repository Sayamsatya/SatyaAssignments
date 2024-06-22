package Construtor;

	public class Child extends Parent {

		Child() {
	        this(10);
	        System.out.println("Child default constructor");
	    }

	    Child(int a) {
	        this(a, a); 
	        System.out.println("Child one parameterized constructor");
	    }

	    Child(int a, int b) {
	        this(a, b, b); 
	        System.out.println("Child two parameterized constructor");
	    }

	    Child(int a, int b, int c) {
	        super(a, b, c); 
	        System.out.println("Child three parameterized constructor");
	    }
	    public static void main(String[] args) {
	        Child c = new Child(); 
	    }
}
