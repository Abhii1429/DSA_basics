package Loops;
import java.util.Scanner;
public class Que1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any number : ");
            int n = sc.nextInt();

        System.out.println("Table of "+n + " is : ");
            int i = 1;
            while(i<= 10){
                System.out.println(i*n);
                i++;
            }
    }
}

