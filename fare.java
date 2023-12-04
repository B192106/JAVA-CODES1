import java.util.*;
interface fa
{
    abstract void getamount();
}
class bus implements fa
{
    int amount;
    int kilometers;
    bus(int amount,int kilometers)
    {
        this.amount=amount;
        this.kilometers=kilometers;
    }
    public void getamount()
    {
        System.out.println(amount*kilometers);
    }
}
class train implements fa
{
    int amount;
    int kilometers;
    train(int amount,int kilometers)
    {
        this.amount=amount;
        this.kilometers=kilometers;
    }
    public void getamount()
    {
        System.out.println(amount*kilometers);
    }
}
class fare
{
    public static void main(String a[])
    {
        System.out.println("enter bus details");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int kilometers=sc.nextInt();

        bus b=new bus(amount,kilometers);
        b.getamount();

       System.out.println("enter train details");
       // Scanner sc1=new Scanner(System.in);
        int amount1=sc.nextInt();
        int kilometers1=sc.nextInt();
        train t=new train(amount1,kilometers1);
        t.getamount();
    }
}