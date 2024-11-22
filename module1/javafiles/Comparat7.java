import java.util.*;



@SuppressWarnings("unused")
class Comparat7
{
    public static void main(String args [])
    {
        ArrayList <String> s1=new ArrayList<>();
        s1.add("banana");
        s1.add("blueberry");
        s1.add("apple");
        
        s1.sort((a,b)->b.length()-a.length());
        System.out.println(s1);

    }
}