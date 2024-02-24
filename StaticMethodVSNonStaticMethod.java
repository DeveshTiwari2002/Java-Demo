import java.util.Arrays;

class Demo
{
    static void disp1()
    {
        System.out.println("Static method disp1");
    }

    void disp2()
    {
        System.out.println("Non Static disp2");
    }
}

public class StaticMethodVSNonStaticMethod {
    public static void main(String[] args)
    {
        Demo.disp1();

        //Demo.disp2();

        Demo d = new Demo();
        d.disp2();
        d.disp1();

        Arrays.sort(args);
    }
}
