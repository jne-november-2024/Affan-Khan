class Calculator
{
   public int add(int n4,int n6)

   {
    return n4+n6;
   }
   public void show()
   {
    System.out.println("In void Show");
   }
}


class objects3
{
    public static void main(String args[])

{   int n7=0;
    Calculator c=new Calculator();
    n7=c.add(9,8);
    System.out.println(n7);
    c.show();
}
}