import java.util.ArrayList;
import java.util.Optional;
class Strea3
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        Optional<Integer> o=list.stream().reduce((x,y)->x+y);
        System.out.println(o.get());
        boolean d=list.stream().anyMatch(x->x%2==0);
        System.out.println(d);
        boolean f=list.stream().allMatch(x->x>0);
        System.out.println(f);
        boolean e=list.stream().noneMatch(x->x<0);
        System.out.println(e);

         
    }
}