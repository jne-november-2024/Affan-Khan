import java.util.*;
class StringComparator implements Comparator<String>
{
    @SuppressWarnings("override")
    public int compare(String s1,String s2)
    {
      return s1.length()-s2.length();
    }
}

@SuppressWarnings("unused")
class Comparat6
{
    public static void main(String a [])
    {
        ArrayList <String> s1=new ArrayList<>();
        s1.add("banana");
        s1.add("blueberry");
        s1.add("apple");
        s1.sort(new StringComparator());
        System.out.println(s1);

    }
}