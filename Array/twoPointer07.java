package Array;

public class twoPointer07 {
   public static void main(String[]args){
    //using while loop 
    //reverse arr
    int[] arr = {10,20,30,40,50,60,70,80}; 
    for(int ele : arr){
        System.out.print(ele+" ");
    }
    System.out.println();
    int n = arr.length;

    int i = 0, j = n-1;
    // int i = 1, j = 5;//reverses part of the array

    while(i <= j){
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        swap(arr, i,j);
        i++;
        j--;
    }
    for(int ele : arr){
        System.out.print(ele + " ");
   }
    System.out.println();
   } 
   public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
   }
}
