class A extends Thread
{
public void run()
{ 
    
    for(int i=0;i<100;i++)
    {System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
}
}
}
class B extends Thread
{
public void run()
{
    { for(int i=0;i<100;i++)
    {
    System.out.println("hello");
     try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }}
}
}
}
class threads
{
    public static void main(String args[])
    {
        A obj=new A();
        B obj1=new B();
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        obj.start();
        obj1.start();

    }
}