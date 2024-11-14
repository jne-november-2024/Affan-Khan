@FunctionalInterface
interface A{
    int add(int i,int j);
}

class Lambda3
{
    public static void main(String args[])
    {
    A obj=(i,j)->i+j;
    int iresult=obj.add(7,8);
    System.out.println(iresult);
    }
}