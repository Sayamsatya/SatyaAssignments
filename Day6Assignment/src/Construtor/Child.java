package Construtor;

	public class Child extends Parent {

	    public Child() {
	        this(12);
	        System.out.println("Child default constructor");
	    }
	    
	    public Child(int a) {
	        this(12, 13);
	        System.out.println("Child one parameterized constructor");
	    }
	    
	    public Child(int a, int b) {
	        super(12, 13, 14);  // Use the parent three parameterized constructor
	        System.out.println("Child two parameterized constructor");
	    }
	    
	    public Child(int a, int b, int c) {
	        this();
	        System.out.println("Child three parameterized constructor");
	    }
	    
	    public static void main(String[] args) {
	        Child c = new Child(12, 12, 11);
	    }
}
