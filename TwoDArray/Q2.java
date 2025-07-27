package TwoDArray;

public class Q2 {
    public static void main(String[]args){
        int[][] arr = {{12,13,15},{25,23,14},{35,22,10}};
         // Largest value in 2D array
        // method-1
        // int mx = arr[0][0];//initializing with 1st index
        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 3; j++){
        //         if(arr[i][j] > mx){ //this if condition compares and hold the largest value in array
        //             mx = arr[i][j]; //update mx if larger value found
        //         }
        //     }
        // }
        // System.out.print("Largest value: " +mx);

        // method-2: for Max value
         int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                mx = Math.max(mx, arr[i][j]);
            }
        }
        System.out.println("Max value is:"+ mx);

        // for min value :
        int mn = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                mn = Math.min(mn, arr[i][j]);
            }
        }
        System.out.print("Max value is:"+ mn);
    }
}
