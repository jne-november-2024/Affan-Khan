

abstract class Car
{
    public abstract void drive();
    public abstract void fly();
    public void  enginestart()
    {
        System.out.println("start engine");
    }
}
class Bmw extends Car{
     public void drive()
     {
        System.out.println("driving");
     }
    public void fly()
    {
          System.out.println("flying");
    }
}



class Abstracts
{
    public static void main(String args[])
    {
     Bmw b =new Bmw();
     b.enginestart();
     b.drive();
     b.fly();

    }
}