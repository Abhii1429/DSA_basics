package Pattern_printing.Squares;
public class StarRectangle {
    public static void main(String[] args) {
       //Nested loops
        for(int i=1; i <= 3; i++){ //It represents no. of Rows used.
             for (int j = 1; j <= 5; j++ ){ //This loops represents No. of column.
               System.out.print("*");
           }
            System.out.println();
        }
    }
}

