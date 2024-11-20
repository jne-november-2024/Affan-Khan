import java.util.*;

public class Collects5 {
    public static void main(String[] args) {
        List<String> doubleAdvocates = List.of(
            "Ana", "Billy", "Denys", "Jim", "Nicolai",
            "Ana", "Billy", "Denys", "Heather", "Jim", "Nicolai"
        );
        List<String> someAdvocates = List.of("Denys", "Heather");

       
        int firstIndex = Collections.indexOfSubList(doubleAdvocates, someAdvocates);
        System.out.println("First occurrence index: " + firstIndex); 
    }
}
