class Excep4
{
    public static void main(String args[])
    {
        int i=2,result=0;
        int j=18;
        int  arr[]=new int[5];

        try{
      
        result=j/i;
        System.out.println(arr[2]);
        System.out.println(arr[5]);

        }
        catch(Exception e){
          System.err.println("e"+e);
        }
        
        System.out.println("result is -->"+result);
        System.out.println("end of execution");

    }
}