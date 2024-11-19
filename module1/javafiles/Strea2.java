import java.util.ArrayList;
import java.util.List;
class Strea2
{
    public static void main(String args[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("rahul");
        list.add("ajay");
        list.add("vijay");
        System.out.println(list);
        List<String>list1=list.stream().map(x->x.toUpperCase()).toList();
        System.out.println(list1);
    }
}