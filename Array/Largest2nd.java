package Array;

public class Largest2nd {
    public static void main(String[]args){
          int[] arr = {-10,-8,-43,-56,-456};

        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            //  if(arr[i] > mx) mx = arr[i];
            mx = Math.max(mx, arr[i]);
        }
    //2nd Largest No.
        int smx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if (arr[i] != mx) {
            //  if(arr[i] != mx) smx = arr[i];
              smx = Math.max(smx,arr[i]);
            }
        }
         System.out.print("\n "+"Largest Number:" + mx);
            System.out.print("\n "+ "Smallest Number:" + smx);  
    }
}
 