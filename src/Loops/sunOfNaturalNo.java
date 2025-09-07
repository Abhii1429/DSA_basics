package Loops;
//Q1. Write a Java program to calculate the sum of natural numbers
//     up to a given positive integer 'n'.
import java.util.Scanner;
public class sunOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        int sum = 0;
        int i =1;
        while(i <= n){ //I was writing the wrong condition while
            sum+= i;
            i++; // I also forgot to increment "i" thats why it went into infinite loop
        }
        System.out.println(sum);
    }
}
