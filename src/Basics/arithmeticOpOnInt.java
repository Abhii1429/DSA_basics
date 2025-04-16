package Basics;

public class arithmeticOpOnInt {
    public static void main(String[] args) {
        /*Methods of Declarations and Initialisation
        int x
        x =5;
        int y;
        y = 2;
        OR
        int x = 5; //2nd Method
        int y = 2; */
        int x = 5, y = 2;  //3rd Method
        System.out.println(x + y); //Outputs : 7
        System.out.println(x - y);//3
        System.out.println(x * y);//10
        System.out.println(x / y);// Real out: 2 (not 2.5)
        //Division gives the "int" as output because all are in "int", while real out is in decimal{float/double}
    }

}
