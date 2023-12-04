abstract class emp
{
    int weeks;
    int wages;
    int hours;
    int wage;
    abstract void getamount();
}
class weeklyemployee extends emp
{
    int weeks;
    int wages;
    void setweeklyemployee(int weeks,int wages)
    {
        this.weeks=weeks;
        this.wages=wages;
    }
    void getamount()
    {
        System.out.println(weeks*wages);
    }
}
class hourlyemployee extends emp
{
    int hours;
    int wage;
    void sethourlyemployee(int hours,int wage)
    {
        this.hours=hours;
        this.wage=wage;
    }
    void getamount()
    {
        System.out.println(hours*wage);
    }
}
class employee
{
    public static void main(String a[])
    {
        weeklyemployee w=new weeklyemployee();
        System.out.println("weekly based:");
        w.setweeklyemployee(4,1000);
        w.getamount();

        hourlyemployee h=new hourlyemployee();
         //System.out.println("weekly based:");
    System.out.println("weekly based:");
   
        h.sethourlyemployee(2,8000);
        h.getamount();
    }
}