package Conditionals;
import java.util.Scanner;
public class agesOfRamShyam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1 = sc.nextInt();
        System.out.print("Enter Shyam age   :");
        int age2 = sc.nextInt();
        System.out.print("Enter Ajay age  :");
        int age3 = sc.nextInt();

        if(age1 > age2){
            if(age2 > age3) System.out.println("Ajay is youngest");
            else System.out.println("Shyam is youngest");
                if(age1 >age3){ System.out.println("Ajay is youngest");}
            else System.out.println("Ram is youngest");
        }
        sc.close();
    }
}