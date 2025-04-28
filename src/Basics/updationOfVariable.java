package Basics;

public class updationOfVariable {
    public static void main(String[] args) {
        //x = 5; - this is not possible; we have to define the type of variable first that's why it was giving error.
        int x = 5;
        System.out.println(x);
        //Shortcuts used for update in variable:
        x += 7;  //it implies- x =x+7
        System.out.println(x);
        x -= 2; //x =x-2
        System.out.println(x);
        x *= 6; //x=x*6
        System.out.println(x);
        x /= 10;
        System.out.println(x);
    }
}
