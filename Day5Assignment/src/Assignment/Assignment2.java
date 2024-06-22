package Assignment;

import java.util.Scanner;

public class Assignment2 {

		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);

		        System.out.println("Enter value of x1:");
		        int x1 = s.nextInt();
		        
		        System.out.println("Enter value of x2:");
		        int x2 = s.nextInt();

		        System.out.println("Enter value of x3:");
		        int x3 = s.nextInt();

		        System.out.println("Enter value of x4:");
		        int x4 = s.nextInt();

		        System.out.println("Enter value of x5:");
		        int x5 = s.nextInt();

		        System.out.println("Enter value of x6:");
		        int x6 = s.nextInt();

		        int result = (((((x1 + x2) - x3) + x4) * x5) / x6);

		        System.out.println("The result of the expression is: " + result);
		        
		        s.close();
		        
		    }
		}
