class Calculator
{
  public int add(int n1,int n2)
    {
        return n1+n2;
    }
public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
}

class Objects
{
    public static void main(String args[])
    {
     Calculator c=new Calculator();
     int d=c.add(2,3);
     System.out.println("d  "+d);
     int e=c.add(8,3,8);
     System.out.println("e  "+e);
  
    }
}