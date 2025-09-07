public class Test {
        int a;
        String name;
        public static void main(String[] args) {
            //Creation of objects:
            //1.declare the variable
            //2.create the object
            // int num = 5; //Primitive variable : num
            Test obj1 = new Test(); //Reference variable : obj
            Test obj2 = new Test();
//Instance variable
            obj1.name = "Abhi";

            System.out.println(obj1.a);
            System.out.println(obj1.name);

            System.out.println(obj2.a);
            System.out.println(obj2.name);
        }
}

