package Array;

import java.util.Scanner;

public class variableSizeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter size of Array :");
         int n = sc.nextInt();
         
         int[] arr = new int[n];

         //input => loop
         System.out.print("Input the elements of arr:");
          for(int i = 0; i <= n-1; i++){
          arr[i] =sc.nextInt();
         }
          //output -> loop
         System.out.print("Output of arr:");
         for(int i = 0; i <= n-1; i++){
          System.out.print(arr[i] + " ");
        }
    }
}
