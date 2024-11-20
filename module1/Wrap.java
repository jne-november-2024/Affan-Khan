class Wrap
{
    public static void main(String args[])
    {
        int num=89;
        Integer num2=num; //Autoboxing 
        System.out.println("Value of num2: " + num2);
        System.out.println("Type of num2: " + num2.getClass().getName());
        int num3=num2;//Autounboxing
        System.out.println("Value of num3: " + num3);
       
    }
}