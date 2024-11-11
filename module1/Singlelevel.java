class Animal
{
    public void sound(){
        System.out.println("in animal parent class");
    }
}
class Dog extends Animal{
    public void sound()
    {      super.sound();
           System.out.println("in dog child class");
    }
}

class Singlelevel
{
    public  static void main(String args[])
    {
  Dog d=new Dog();
  d.sound();
    }
}