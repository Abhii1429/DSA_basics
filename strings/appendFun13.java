package strings;

public class appendFun13 {
    public static void main(String[]args){
        StringBuilder s = new StringBuilder("Abc");
         System.out.println(s);
         s.append(35); // integer
         System.out.println(s);
         s.append('*'); // character
         System.out.println(s);
         s.append("xyz"); // string
         System.out.println(s);

         char[] ch = {'r', 'a', 'g'};
         s.append(ch); // character array
         System.out.println(s);

         int[] arr = {1, 2, 3, 4, 5};
         s.append(arr);
         System.out.println(s); // address of array get printed not the array itself

         StringBuilder t = new StringBuilder("pqr");
         s.append(t); // string builder
         System.out.println(s);

        //  s += "fgwf"; // not possible in stringbuilder
    }
}
