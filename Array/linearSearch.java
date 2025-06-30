package Array;
import java.util.*;
public class linearSearch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.print("Enter Array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target element :");
        int x = sc.nextInt();
        
        //solution
        boolean flag = false; //false means not found
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                flag = true; //true means found
                break;
            }
        }
        if(flag == true) System.out.println("Element Found");
        else System.out.println("Element not Found");
        sc.close();
    }
}
