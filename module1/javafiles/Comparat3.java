import java.util.*;

class MyNewComparator  implements Comparator<Integer>
{  @Override
    public int compare(Integer n1,Integer n2)
    {
        return n1-n2;
    }
}
@SuppressWarnings("unused")
class Comparat3
{
    public static void main(String a [])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(90);
        list.add(34);
        list.add(78);
        list.sort(new MyNewComparator());
        System.out.println(list);

    }
}