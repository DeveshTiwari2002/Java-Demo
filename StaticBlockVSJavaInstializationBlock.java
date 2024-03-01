public class StaticBlockVSJavaInstializationBlock {
    static int age;
    static
    {
        System.out.println("Static Block");
        age = 17;
    }

    static void disp()
    {
        System.out.println("Disp static method");
        System.out.println(age);
    }
    public static void main(String[] args)
    {
        System.out.println("Main Method");
        disp();
    }
}
