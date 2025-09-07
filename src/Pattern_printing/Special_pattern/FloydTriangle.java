package Pattern_printing.Special_pattern;
import java.util.Scanner;
public class FloydTriangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n:");
            int n = sc.nextInt();

            int a = 1;
           for (int i = 1; i <= n ; i++) { //rows
              for (int j = 1; j <= i; j++) { //columns
//                System.out.print(a +" ");
//                a ++;
               System.out.print(a++ +" ");
//                  //a++ is known as post-increment operator;
//                  // it does the same task of printing and incrementing value of 'a' each time in loop
              }
            System.out.println();
          }
    }
}
