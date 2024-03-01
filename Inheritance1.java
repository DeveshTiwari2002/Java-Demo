package Inheritance;
class Human1 // super class // base class // parent class
{
    private String name;
    int age;

    Human1()
    {
        System.out.println("Human class constructor");
    }
    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1 //child class // sub-class //derived class
{
    void disp()
    {
        System.out.println("The age is:"  + age);
        // System.out.println("The Name is :" +name);
    }
    
}
public class Inheritance1 {
    public static void main(String[] args)
    {
        Student1 st1=new Student1();
        st1.sleep();
        st1.disp();
    }
}
