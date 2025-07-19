package TwoDArray;

public class Q3SumOfAllEle {
    public static void main(String[]args){
        // int[][] arr = {{12,13,15},{25,23,14},{35,22,10}};
        int[][] arr = {{1,3,5},{2,3,4},{6,2,7}};
    
        // sum of elements in array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum :" + sum );

        // product
         double pd = 1;
         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                pd = pd * arr[i][j];
            }
        }
        System.out.println("Products :" + pd );
    }
}
  