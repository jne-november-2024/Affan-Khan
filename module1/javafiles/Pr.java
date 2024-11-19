import java.util.function.Predicate;
class Pr{
    public static void main(String args[]) {
     
        Predicate<Integer> p = x -> x % 2 == 0;

        
        System.out.println(p.test(4));
        System.out.println(p.test(7)); 
    }
}
