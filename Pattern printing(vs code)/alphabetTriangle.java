package PatternPrinting;

import java.util.Scanner;

public class alphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row r:");
        int r = sc.nextInt();
        System.out.print("Enter column c:");
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }   
    }
}
