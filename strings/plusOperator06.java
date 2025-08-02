package strings;

public class plusOperator06 {
    public static void main(String[]args){
        String s= "abc";
        // s = s.concat(10); adds strings only
        String t = "pqr";
        s += t; // s = s+t => abcpqr
        s = 10 + s;
        System.out.println(s);
        System.out.println("Hi I am "+ 10); // string + number

    }
}
