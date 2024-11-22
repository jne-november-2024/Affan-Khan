import java.util.*;
class Ifelse{
public static void main(String args[])
{Scanner sobj=new Scanner(System.in);
System.out.println("enter age:");
int age=sobj.nextInt();
if (age>18)
{
    System.out.println(" eligible to vote");
}
else{
        System.out.println(" not eligible to vote");
}
sobj.close();
}

}