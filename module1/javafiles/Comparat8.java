import java.util.*;
class Comparat8
{
    public static void main(String args[])
    {
        ArrayList <String>a1=new ArrayList<>();
        a1.add("cherry");
        a1.add("guava");
        a1.add("coconut");
        a1.sort((a,b)->a.length()-b.length());
        System.out.println("a1  --"+a1);

    }}
