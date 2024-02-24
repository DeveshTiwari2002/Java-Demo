import java.util.Scanner;

class Farmer
{
    int PA; //principal amount
    float TD; //Time Duration
    static float RI; //Rate of Interest
    float SI; // Simple Interest

  static
  {
      RI = 4.5f;
  }
    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the required amount");
        PA = scan.nextInt();
        System.out.println("Please enter the time duration");
        TD= scan.nextFloat();
    }

    void compute()
    {
        SI = (PA*TD*RI)/100;
    }

    void disp()
    {
        System.out.println("SI is : "+SI);
    }
}
public class FarmerLoanApplication
{
    public static void main(String[] args)
    {
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();

        f1.input();
        f1.compute();
        f1.disp();

        f2.input();
        f2.compute();
        f2.disp();
    }
}
