import java.util.*;


class Collects{
    public static void main(String args [])
    {
      List<Integer> l1=new ArrayList<>();
      l1.add(3);
      l1.add(4);
      l1.add(9);
      l1.add(12);
      List<Integer> even= l1.stream().filter(e->e%2==0).collect(java.util.stream.Collectors.toList());
     System.out.println(even+","+even.getClass().getName());
    }
}