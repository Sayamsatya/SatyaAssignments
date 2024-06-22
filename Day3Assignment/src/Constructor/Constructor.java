package Constructor;

public class Constructor {

	public Constructor()	{
		this(1, 2, 3);
		System.out.println("Default Constructor");
	}
	public Constructor(int a)	{
		System.out.println("One Parameterized Constructor");
	}
	public Constructor(int a, int b)	{
		System.out.println("Two Parameterized Constructor");
	}
	public Constructor(int a, int b, int c)	{
		System.out.println("Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		
		Constructor ob1 = new Constructor();
		Constructor ob2 = new Constructor(1);
		Constructor ob3 = new Constructor(1,2);
	}
}
