package Assignment;

public class Assignment1 {

	public int sum(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("Sum result is: " +c);
		return c;
	}
	
	public int sum1(int c, int d)
	{
		int e;
		e = c+d;
		System.out.println("Sum1 result is: " +e);
		return e;
	}
	
	public int sub(int e, int f)
	{
		int g;
		g = e -f;
		System.out.println("Sub result is: " +g);
		return g;
	}
	
	public int multi(int g, int h)
	{
		int i;
		i= g*h;
		System.out.println("multi result is: " +i);
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
		Assignment1 ass = new Assignment1();
		int sumResult = ass.sum(10, 2);
		int sum1Result = ass.sum1(sumResult, 2);
		int subResult = ass.sub(sum1Result, 2);
		int multiResult = ass.multi(subResult, 2);
		ass.div(multiResult,2);
			
	}
}
