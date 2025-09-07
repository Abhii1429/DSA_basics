package Loops;
public class continueKeyword {
    public static void main(String[] args) {
        //calc odd numbers:
        //1st method:- "100 iterations"
//        for (int i = 1; i <= 100 ; i++) {
//         if(i % 2 != 0) System.out.print(i + " ");

        //2nd method : "50 iterations"
//        for (int i = 1; i <= 100 ; i += 2) {
//            System.out.print(i + " ");

        //3rd method:- "100 iterations"
        for (int i = 1; i <= 100 ; i++) {
          if(i % 2 == 0) continue;
          System.out.print(i + " ");
        }
    }
}
