
// ******** SINGLE - LEVEL INHERITANCE *************
//package Inheritance;
//
//class Animal
//{
//    void sleep()
//    {
//        System.out.println("Animal need sleep");
//    }
//}
//
//class Tiger extends Animal
//{
//
//}
//public class Inheritance2 {
//    public static void main(String[] args){
//        Tiger t = new Tiger();
//        t.sleep();
//    }
//}
//--------------------------------------------------------------------
// ********** MULTI - LEVEL INHERITANCE *******************

//package Inheritance;
//class Demo1
//{
//    void disp()
//    {
//        System.out.println("Disp written in demo1 class");
//    }
//}
//class Demo2 extends Demo1
//{
//
//}
//class Demo3 extends Demo2
//{
//
//}
//
//public class Inheritance2
//{
//    public static void main(String[] args)
//    {
//        Demo3 d= new Demo3();
//        d.disp();
//    }
//}
//--------------------------------------------------------------------
// ********** HIERARCHICAL INHERITANCE *******************

////package Inheritance;
//class Animal
//{
//    void sleep()
//    {
//        System.out.println("Animal need sleep");
//    }
//}
//class Tiger extends Animal
//{
//
//}
//class monkey extends Animal
//{
//
//}
//class Deer extends Animal
//{
//
//}
//public class Inheritance2
//{
//    public static void main(String[] args)
//    {
//        Tiger t=new Tiger();
//        t.sleep();
//        Deer d= new Deer();
//        d.sleep();
//
//    }
//}

//--------------------------------------------------------------------
// ********** MULTIPLE INHERITANCE *******************
class Parent1
{
    int age=18;
}
class parent2
{
    int age = 19;
}
class child extends Parent1, Parent2
{

}
public class Inheritance2
{
    public static void main(String[] args){

    }
}