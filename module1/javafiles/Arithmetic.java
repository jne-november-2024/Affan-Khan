import java.util.*;
class Arithmetic 
{
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int a=0,b=0,c=0;
        System.out.println(" enter number a :");
        a=sobj.nextInt();
        System.out.println(" enter number b :");
        b=sobj.nextInt();
        c=a+b;
        System.out.println("Addition is "+c);
        c=a-b;
        System.out.println("Subtracion is "+c);
        c=a*b;
        System.out.println("Multiplication is "+c);
        c=a/b;
        System.out.println("Divivsion is "+c);
        c=a%b;
        System.out.println("Modulos is "+c);
    }
}