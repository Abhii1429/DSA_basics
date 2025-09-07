package Loops;
public class differentLoops {
    public static void main(String[] args) {
      //for-loop: it won't execute as 11<10
//        int i = 11;
//        for ( ; i <= 10; ) {
//            System.out.println(i);
//            i++;
        //while-loop:it will also be not executed as error reflected is 11<10.
//        int i = 11;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
        //do-while loop:
        int i = 11;
        do{
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}
