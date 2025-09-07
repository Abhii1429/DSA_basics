package Pattern_printing.Special_pattern;
import java.util.Scanner;
public class BinaryTriangle {
    public static void main(String[] args) {
     Scanner ref = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = ref.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
//        1st method:        if (i%2 == 1){
//                    if (j%2 == 1){
//                        System.out.print("1" + " ");
//                    }else System.out.print("0"+" ");
//                }else{ //i%2 == 0
//                    if (j%2 == 0){
//                        System.out.print("1"+ " ");
//                    }else System.out.print("0"+ " ");
//                }
               // 2nd method:
               if ((i+j)%2 == 0) System.out.print( 1 + " ");
               else System.out.print( 0 + " ");
            }
            System.out.println();
        }
    }
}

