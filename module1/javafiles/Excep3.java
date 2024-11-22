class Excep3
{
    public static void main(String args[])
    {
        int i,result=0;
        int j=18;
        try{
        i=0;
        result=j/i;
        }
        catch(Exception e){
          System.err.println("e"+e);
        }
        
        System.out.println("result is -->"+result);
        System.out.println("end of execution");

    }
}