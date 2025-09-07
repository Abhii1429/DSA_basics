package Pattern_printing.Special_pattern;
import java.util.Scanner;
public class starTriangleFlipped {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ //row
            for (int j = 1; j <= n ; j++) {
                if((i+j) >= 5) System.out.print("*" + " "); //logic part
                else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
