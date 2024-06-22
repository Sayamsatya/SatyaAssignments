package Assignment;

public class Assignment2 {

	public int multi(int a, int b)
	{
		int c;
		c = a*b;
		System.out.println("Multi result is: " +c);
		return c;
	}
	
	public int sub(int c, int d)
	{
		int e;
		e = c-d;
		System.out.println("Sub result is: " +e);
		return e;
	}
	
	public int sum(int e, int f)
	{
		int g;
		g = e+f;
		System.out.println("Sum result is: " +g);
		return g;
	}
	
	public int subs(int g, int h)
	{
		int i;
		i= g-h;
		System.out.println("Sub1 result is: " +i);
		return i;
	}
	
	public int div(int i, int j)
	{
		int k;
		k= i/j;
		System.out.println("Div result is: " +k);
		return k;
	}
	
	public static void main(String[] args) {
		Assignment2 ass = new Assignment2();
		int multiResult = ass.multi(10, 2);
		int subResult = ass.sub(multiResult, 2);
		int sumResult = ass.sum(subResult, 2);
		int subsResult = ass.subs(sumResult, 2);
		ass.div(subsResult,2);
			
	}
}
