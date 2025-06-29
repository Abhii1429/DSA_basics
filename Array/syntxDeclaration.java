package Array;
import java.util.*;
public class syntxDeclaration {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int[] arr = new int[7];

      //input => loop
      System.out.print("Input the elements of arr:");
      for(int i = 0; i <= 6; i++){
        arr[i] =sc.nextInt();
      }

    // //initializing individual elements
    // arr[0] = 10;
    // arr[1] = 20;
    // arr[2] = 30;
    // arr[3] = 40;
    // arr[4] = 50;
    // arr[5] = -60;
    // arr[6] = 70;

    //output of array elements
    // System.out.print(arr[0]+" ");
    // System.out.print(arr[1]+" ");
    // System.out.print(arr[2]+" ");
    // System.out.print(arr[3]+" ");
    // System.out.print(arr[4]+" ");

    // System.out.print(arr[0]+" ");
    // arr[0] =90;
    // arr[0] += 10;//updation in value of array
    // System.out.println(arr[0] +" ");

    //output -> loop
    System.out.print("Output of arr:");
    for(int i = 0; i <= 6; i++){
        System.out.print(arr[i] + " ");
    }
  }
}
