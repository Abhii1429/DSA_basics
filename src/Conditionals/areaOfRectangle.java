package Conditionals;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the rectangle : ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of the rectangle : ");
        double b = sc.nextDouble();
        double a = l*b;
        double p = 2*(l+b);
        if(a>p) System.out.println("Area is greater than perimeter");
        else System.out.println("Perimeter is greater than Area");
    }
}
