package Conditionals;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter a number : ");
        int n = sc.nextInt();
        if (n%2 == 0)
            System.out.println( n +" is an Even Number.");
        if(n%2 == 1)
            System.out.println( n +" is an Odd Number.");
         sc.close();
    }
}
