class Mobile
{
    int price;
    String name;
    static String type="SmartPhone";


    public void show()
    {
        System.out.println(price+" "+name+" "+type);
    }
}


class Statics
{
    public static void main(String args[])
    {
     Mobile obj=new Mobile();
     obj.price=29999;
     obj.name="samsung";
     obj.show();
    Mobile obj1=new Mobile();
     obj1.price=14999;
     obj1.name="redmi";
     obj1.show();
     
    }
}