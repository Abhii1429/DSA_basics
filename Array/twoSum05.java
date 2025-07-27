package Array;

public class twoSum05 {
    public static void main(String[]args){
        int[] arr = {3,0,8,5,4,9,2};
        int x = 9;
        //solution
        System.out.println("Doublets are ");
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if( arr[i] + arr[j] == x){
                    System.out.print( arr[i] + " "+ arr[j]);
                    //break;
                }
            }
        }
        //Sir's optimized approach
    //      public int[] twoSum(int[] arr, int x) {
    //     int ans[] = new int[2];
    //     // solu. with sir's help
    //     for(int i = 0; i < arr.length; i++){
    //         boolean flag = false; //optimization 
    //         for(int j = i+1; j < arr.length; j++){
    //            if(arr[i] + arr[j] == x){
    //             ans[0] = i;
    //              ans[1] = j;   
    //              flag = true;//optimization
    //              break;//optimization          
    //            } 
    //         }
    //         if(flag == true) break; //optimization
    //     }
    //    return ans; 
    //  }
    }
}
