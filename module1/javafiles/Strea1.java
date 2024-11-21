import java.util.ArrayList;
class Strea1
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
      long a=list.stream().filter(x->x%2==0).count() ;
      System.out.println(a);
    }
}