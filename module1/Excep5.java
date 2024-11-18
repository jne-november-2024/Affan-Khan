class Excep5
{
    public static void main(String args[])
    {
        int i=2,result=0;
        int j=18;
        int  arr[]=new int[5];
        String str=null;

        try{
      
        result=j/i;
        System.out.println(arr[2]);
        System.out.println(arr[4]);
        System.out.println(str.length());


        }
        catch(ArrayIndexOutOfBoundsException e){
          System.err.println("e"+e);
        }
        catch(ArithmeticException e){
         System.err.println("e"+e);
        }
        catch(Exception e){
         System.err.println("e"+e);
        }
        System.out.println("result is -->"+result);
        System.out.println("end of execution");

    }
}