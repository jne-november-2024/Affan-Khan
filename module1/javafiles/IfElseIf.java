import java.util.*;

class IfElseIf {
    public static void main(String[] args) {
     
        int age = 0;
        
  
        Scanner sobj = new Scanner(System.in);
        
        
        System.out.print("Enter age: ");
        age = sobj.nextInt(); 
        
       
        if (age > 18 && age<=59) {
            System.out.println("Eligible to vote");
        } else if (age >= 60) {
            System.out.println("Old");
        } else {
            System.out.println("Not eligible to vote");
        }

          sobj.close();
    }
}
