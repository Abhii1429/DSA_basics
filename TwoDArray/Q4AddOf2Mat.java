package TwoDArray;

public class Q4AddOf2Mat {
    public static void main(String[]args){
       // addition of two matrix
        int[][] a = {{1,9,2},{3,7,4},{8,5,6}};
        int[][] b = {{9,3,7},{8,6,5},{2,4,1}};
        int m = a.length;
        int n = b[0].length; //n= a[0].length

        int[][] res = new int[m][n];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                res[i][j] = a[i][j] + b[i][j];
            }
        }
       for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(res[i][j] +" " );
            }
            System.out.println();
        }

// H.W: Print the sum of these two array without using extra array
    } 
}
