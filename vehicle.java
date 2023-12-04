interface veh
{
    abstract void getcolor();
    abstract void getnumber();
    abstract void getconsumption();
}
class twowheeler implements veh
{
    int fuel;
    int number;
    String color;
    public void settwowheeler(int fuel,int number,String color)
    {
        this.fuel=fuel;
        this.number=number;
        this.color=color;
    }
    public void getcolor()
    {
        System.out.println(color);
    }
    public void getnumber()
    {
        System.out.println(number);
    }
    public void getconsumption()
    {
        System.out.println(fuel);
    }
}
class fourwheeler implements veh
{
    int fuel;
    int number;
    String color;
    public void setfourwheeler(int fuel,int number,String color)
    {
        this.fuel=fuel;
          this.number=number;
        this.color=color;
    }
    public void getcolor()
    {
          System.out.println(color);
    }
    public void getnumber()
    {
        System.out.println(number);
    }
    public void getconsumption()
    {
        System.out.println(fuel);
    }
}
class vehicle
{
    public static void main(String a[])
    {
        twowheeler t=new twowheeler();
        t.settwowheeler(100,1001,"blue");
        t.getcolor();
        t.getconsumption();
        t.getnumber();

        fourwheeler f=new fourwheeler();
        f.setfourwheeler(200,2001,"red");
        f.getcolor();
        f.getconsumption();
        f.getnumber();
    }
}
     