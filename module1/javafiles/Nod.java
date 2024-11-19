import java.util.*;
class Nod
{
    public static void main(String args[])
    {LinkedList <Integer> list=new LinkedList<>();
    list.add(6);
    list.add(7);
    list.add(4);
    list.addFirst(11);
    list.addLast(87);
    list.add(4);
    System.out.println(list);
    list.removeFirstOccurrence(4);
    System.out.println(list);


    }
}
