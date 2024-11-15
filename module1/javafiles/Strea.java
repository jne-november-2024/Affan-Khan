import java.util.ArrayList;
class Strea
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);

        System.out.println(list.stream().filter(x->x%2==0).count());
    }
}