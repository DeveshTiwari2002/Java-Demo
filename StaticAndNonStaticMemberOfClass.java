class Demo1
{
    static int a;
    static int b;

    int m;
    int n;

    static
    {
        System.out.println("Control in static block");
        a=10;
        b=20;
    }
    {
        System.out.println("Control in non static block");
        m=50;
        n=40;
    }
    static void disp1()
    {
        System.out.println("value of static var a: "+a);
        System.out.println("value of static var b: "+b);
    }
    void disp2()
    {
        System.out.println("value of non static var m: "+m);
        System.out.println("value of non static var n: "+n);
    }

}
public class StaticAndNonStaticMemberOfClass
{
    public static void main(String[] args)
    {
        Demo1 d= new Demo1();
        Demo1.disp1();
        d.disp2();
    }
}
