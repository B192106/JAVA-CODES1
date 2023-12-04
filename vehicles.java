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
    
    void maintenance()
    {
        System.out.println("regular checkup and oilchange");
    }
    void average()
    {
        System.out.println("average:40km/h");
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
class vehicles
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

        fourwheeler f=new fourwheeler();
        f.setveh("ts122","6345b","skyblue");
        f.display();
        f.getconsumption(20);
        f.displayconsumption();
        f.maintenance();
        f.average();
    }
}