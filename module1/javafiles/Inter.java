

interface A{
    int AGE=24;
    String AREA="Pune";
    void show();
    void config();
}
class B implements A{
  
public void show()
{
    System.out.println("in show B");
}
public void config()
{
    System.out.println("in config B");
}
}




class Inter
{
    public static void main(String args[])
    {
    B obj=new B();
    obj.show();
    obj.config();
    System.out.println(B.AGE+" -->"+B.AREA);
   
    }
}