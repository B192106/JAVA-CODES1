interface pay
{  //int m,n;
    void getamount();
}
class  invoice implements pay
{   
    int m;
    int n;
    public void setinvoice(int m,int n)
   {
        this.m=m;
        this.n=n;
   }
    public void getamount()
    {
        System.out.println((m*100)+n);
    }
}
class employee implements pay
{
    int m;
    public void setemployee(int m)
    {
       this.m=m;
    }
    public void getamount()
    {
        System.out.println(m*100);
    }
}
class payable
{
    public static void main(String a[])
    {
        invoice i=new invoice();
        System.out.println("invoices");
        i.setinvoice(2,3);
        i.getamount();

        employee e=new employee();
        System.out.println("emp");
       e.setemployee(6);
        e.getamount();
    }
}
