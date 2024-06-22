package Practise;

import java.util.Scanner;

public class ScannerPractise {

public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of a:");
        int a = scanner.nextInt();
        System.out.println("Value of a: " + a);

        System.out.println("Enter value of f:");
        float f = scanner.nextFloat();
        System.out.println("Value of f: " + f);
        
        scanner.close();
    }
}
