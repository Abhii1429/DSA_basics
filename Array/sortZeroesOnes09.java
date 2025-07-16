package Array;

public class sortZeroesOnes09 {
    public static void main(String[]args){

        int[] arr = {1,0,0,1,1,0,0,0,1,0};
        // int[] arr = {0,0,0,0,1,1,1};
        int n = arr.length;
        
        // // Method-1 Two pass solution

        // int noOfZeroes = 0, 
        // noOfOnes = 0;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == 0) noOfZeroes++;
        //     else noOfOnes++;
        // }

        // for(int i = 0; i < noOfZeroes; i++){
        //     arr[i] = 0;
        // }
        // for(int i = noOfZeroes; i < n ; i++){
        //     arr[i] = 1;
        // }
        //    for(int ele : arr){
        //     System.out.print(ele +" ");
        // }
        // System.out.println();

        
        // // Method -2 Two pass solution
        // int noOfZeroes = 0;
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == 0) noOfZeroes++;
        // }

        // // for(int i = 0; i < noOfZeroes; i++){
        // //     arr[i] = 0;
        // // }
        // // for(int i = noOfZeroes; i < n ; i++){
        // //     arr[i] = 1;
        // // }
        
        // for (int i = 0; i < n; i++) {
        //      if(i < noOfZeroes) arr[i] = 0 ;
        //      else arr[i] = 1;
        // }
        // for(int ele : arr){
        //     System.out.print(ele +" ");
        // }
        // System.out.println();

        // Method 03-> One pass solution
        // this method fails when we deal with sorted array or partially sorted array
        int i = 0, j = n-1;
        while(i < j){
            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;
            // if(i > j) break; // modification to control the failure that was happening
            // if(arr[i] ==0) i++;
            // else if(arr[j] == 1) j--; //replacement for above three lines
             if(i < j && arr[i] == 1 && arr[j] == 0){ //update in the logic
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
             }
             for(int ele : arr){
                System.out.print(ele +" ");
             }
             System.out.println();
        }
    }
}
