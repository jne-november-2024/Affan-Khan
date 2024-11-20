import java.util.*;
import java.util.stream.Collectors;


class Collects1
{
    public static void main(String args[])
    {
        ArrayList <Integer> l1=new ArrayList<>();
        l1.add(8);
        l1.add(33045);
        l1.add(88);
        l1.add(73);
        Map<Integer,Integer>H=l1.stream().filter(e->e%2!=0).collect(Collectors.toMap(e->e,e->e));   
        System.out.println(H+""+H.getClass().getName()); 
            
        }
}
            
            
        