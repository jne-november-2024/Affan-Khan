import java.util.*;
class Collects8
{
    public static void main(String[] args) {
        
    List<String> advocates = new ArrayList<>(List.of("Ana", "Billy", "Denys", "Heather", "Jim", "Nicolai"));
    List<String> advocatesCopy = new ArrayList<>(List.of("Blank","Blank","Blank","Blank","Blank","Blank", "Blank"));
    Collections.copy(advocatesCopy, advocates);
    System.out.println(advocatesCopy);
    System.out.println(advocates);
    }
}   