class Mobile{
    private int  price;
    private String name;


    public void setName(String n)
    {
        name=n;

    }
    public void setPrice(int p)
    {
        price=p;
    }
    public String getname()
    {
        return name;
    }
    public int getprice()
    {
        return price;
    }

}

class get
{
    public static void main(String args [])
    {
    Mobile m=new Mobile();
    m.setName("Apple");
    m.setPrice(90000);
    String s=m.getname();
    System.out.println(s);
    int p1=m.getprice();
    System.out.println(p1);

    }
}