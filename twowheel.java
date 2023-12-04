class veh
{
    String number;
    String insurancenum;
    String color;
    int consumption;
    void setveh(String number,String insurancenum,String color)
    {
        this.number=number;
        this.insurancenum=insurancenum;
        this.color=color;
    }
    void getconsumption(int consumption)
    {
            this.consumption=consumption;
    }
    void displayconsumption()
    {
       System.out.println(consumption);
    }
    void display()
    {
        System.out.println(number+" "+insurancenum+" "+color);
    }
}
class twowheeler extends veh
{
    String type;
    String name;
    void maintenance()
    {
        System.out.println("regular checkup and oilchange");
    }
    void average()
    {
        System.out.println("average:40km/h");
    }
    void  setall(String type,String name)
    {
        this.type=type;
        this.name=name;
    }
    void gettype()
    {
        System.out.println(type);
    }
    void getname()
    {
        System.out.println(name);
    }
}
class geared extends twowheeler
{
    void average()
    {
        System.out.println("50");
    }
}
class nongeared extends twowheeler
{
    void average()
    {
        System.out.println("100");
    }
}
class fourwheeler extends veh
{
    
    void maintenance()
    {
        System.out.println("regular servicing and tire rotation");
    }
    void average()
    {
        System.out.println("average:15km/h");
    }
}
class twowheel
{
    public static void main(String a[])
    {

        twowheeler t=new twowheeler();
        t.setveh("ts120","1234a","black");
        t.display();
        t.getconsumption(10);
        t.displayconsumption();
        t.maintenance();
        t.average();
        t.setall("bike","herohonda");
        t.gettype();
        t.getname();

        geared g=new geared();
        g.average();

        nongeared n=new nongeared();
        n.average();
        

        fourwheeler f=new fourwheeler();
        f.setveh("ts122","6345b","skyblue");
        f.display();
        f.getconsumption(20);
        f.displayconsumption();
        f.maintenance();
        f.average();
    }
}