public class OOPs {
    int a = 2;
    String name = "Rahul";

    public static void main(String[] args) {
        // declare the variables
        // create the object
        int num = 9; // primitive
        OOPs obj1 = new OOPs(); // reference
        OOPs obj2 = new OOPs();

        obj1.name = "Devesh";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);

    }
}
