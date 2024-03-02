package Inheritance;
class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is Flying");
    }

}
class CargoPlane extends Aeroplane // Inherited method
{
  public void fly() //Overridden method
  {
      System.out.println("CargoPlane flies at lower height");
  }
  public void carryGoods() //Specialized method
  {
      System.out.println("CargoPlane carries goods");
  }
}
class PassengerPlane extends Aeroplane //Inherited method
{
    public void fly() //Overridden method
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger() //Specialized method
    {
        System.out.println("PassengerPlane carries passengers");
    }
}
class Inheritance3
{
    public static void main(String[] args)
    {
       CargoPlane cp=new CargoPlane();
       cp.takeOff();
       cp.fly();
       cp.carryGoods();

       PassengerPlane pp= new PassengerPlane();
       pp.takeOff();
       pp.fly();
       pp.carryPassenger();
    }
}
