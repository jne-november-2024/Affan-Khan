import java.io.*;
import java.util.*;
class Input1
{
    public static void main(String args[] )throws IOException
    {
     InputStreamReader in=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(in);
     System.out.println("enter a number");
     int num=Integer.parseInt(br.readLine());
    // int num=br.readLine();
     System.out.println(num);
     Scanner sobj=new Scanner(System.in);
     System.out.println("enter another number:");
     int num2=sobj.nextInt();
     System.out.println(num2);
     br.close();
    }
}
