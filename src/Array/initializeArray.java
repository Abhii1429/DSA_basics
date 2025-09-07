package Array;
import java.util.Scanner;
public class initializeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //Input:
        System.out.println("Enter Array elements :");
        for (int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }
        //Output:
        System.out.print("Output:");
        for (int i=0; i<=n-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
