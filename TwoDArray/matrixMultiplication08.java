package TwoDArray;

public class matrixMultiplication08 {
    public static void print(int[][]arr){
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] a = {{1,2,1,1},{2,1,2,1}};
        int[][] b = {{1,0,1,2},{1,0,1,2},{2,1,0,0},{0,3,1,1}};

        if(a[0].length != b.length){
            System.out.println("Multiplication not Possible");
        }
        else{ //Multiplication possible
            int[][] ans = new int[a.length][b[0].length];

            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[0].length; j++){
                    // ans[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][3]*b[3][j] +.....so on;
                   
                    //logic -> computation
                    for(int k = 0; k < b.length; k++){
                        ans[i][j] += a[i][j] * b[k][j];
                    }                
                }              
            }
            print(a);
            print(b);
            print(ans);
        }
    }
}
