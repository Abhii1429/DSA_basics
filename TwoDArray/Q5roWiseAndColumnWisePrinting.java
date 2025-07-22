package TwoDArray;

public class Q5roWiseAndColumnWisePrinting {
    public static void main(String[] args){
        // 1 2
        // 3 4
        // 5 6

        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length, n = arr[0].length;

        // normal matrix -> row wise printing
        for(int i = 0; i < m; i++){ //rows
            for(int j = 0; j < n; j++){ // columns
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        // Transpose Matrix => column wise printing
        System.out.println("Transpose Matrix : ");
        for(int j = 0; j < n; j++){ // columns
            for(int i = 0; i < m; i++){ // rows
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        // storing in a new Array
        int[][] transpose = new int[n][m];
        System.out.println("New stored Transpose matrix : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transpose[i][j] = arr[j][i]; // transpose
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
