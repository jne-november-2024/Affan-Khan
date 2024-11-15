class Car{
    int price;
    String name;
    int model;

    public Car(int price,String name,int model)
    {
     this.price=price;
     this.name=name;
     this.model=model;
    }
    public Car()
    {
        price=8779989;
        name="";
        model=898;
    }
    
    public void show()
    {
        System.out.println(this.price+" "+this.name+" "+this.model);
    }
}


class Constructor
{
    public static void main(String args[])
    {
    Car c=new Car();
    c.show();
    Car c1=new Car(56777,"gwagon",2024);
    c1.show();
    }
}
