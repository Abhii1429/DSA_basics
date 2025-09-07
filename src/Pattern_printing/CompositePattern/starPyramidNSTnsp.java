package Pattern_printing.CompositePattern;
import java.util.Scanner;
public class starPyramidNSTnsp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int nsp = n-1;
        int nst = 1; //1st line have 1 star and n-1 spaces.
        for (int i = 1; i <= n; i++) { //Spaces
            for (int j = 1; j <=nsp ; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= nst ; j++) { //star
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--; //space gets reduced by 1 in each line
            nst += 2; //star gets increased by 2 in each next line.
        }
    }
}
