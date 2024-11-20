class Excep6
{
    public static void main(String args[])
    {
        int i=0,result=0;
        int j=18;
      

        try{
      
        result=j/i;
         }
       
        catch(ArithmeticException e){
                result=j/1;
                
         
        }
        catch(Exception e){
         System.err.println("e"+e);
        }
        System.out.println("result is -->"+result);
        System.out.println("end of execution");

    }
}