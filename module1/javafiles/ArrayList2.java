import java.util.*;
class ArrayList2
{
    public static void main(String args[])
    {
        ArrayList <Integer>list=new ArrayList<>();
       
        list.add(56);
        list.add(45);
        list.add(933);
        for(int i:list)
        {
            System.out.println("1 loop  "+i);
        }
        list.add(1,90);
          for(int i:list)
        {
            System.out.println("2nd loop "+i);
        }
        System.out.println(list.contains(56));
       list.set(2,39);
       list.remove(Integer.valueOf(39));
       System.out.println(list);

    }
}