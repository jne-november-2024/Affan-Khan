import java.util.*;
class Collects7
{
    public static void main(String[] args) {
        
    List<String> advocates = new ArrayList<>(List.of("Ana", "Billy", "Denys", "Heather", "Jim", "Nicolai"));
    Collections.addAll(advocates, "Jack", "Jill");
    System.out.println(advocates+""+advocates.getClass().getName());

    }
}