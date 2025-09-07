package Array;
import java.util.Scanner;
public class outputOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        //Input:- Loop
        System.out.println("Enter 7 array elements :");
        for(int i = 0; i<=6; i++) {
            arr[i] = sc.nextInt();
        }

        //output : Loop
        System.out.print("Output of input arr element is:");
        for (int i = 0; i <= 6 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
