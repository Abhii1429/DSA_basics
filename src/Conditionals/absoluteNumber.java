package Conditionals;

import java.util.Scanner;

public class absoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        if(n >= 0) {
            System.out.println("Absolute value is " + n);
        } else{
                System.out.println("Absolute value is "+ -n);
            }
     sc.close();        
    }
}
