package Static;

class Alpha
{
    static int a;
    static int b;

    int m;
    int n;

    static
    {
        System.out.println("static block");
        a=10;
        b=20;
    }
    {
        System.out.println("Non Static Block");
        m = 100;
        n = 200;
    }
}
public class StaticVSInstance {
    public static void main(String[] args) {
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();

    }

}
