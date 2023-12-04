class bankaccount
{
    int accountnumber;
    String holdername;
    int balance;
    bankaccount(int accountnumber,String holdername,int balance)
    {
        this.accountnumber=accountnumber;
        this.holdername=holdername;
        this.balance=balance;
    }
    void getdeposit(int amount)
    {
        balance=balance+amount;
        System.out.println("deposit"+amount+"success");
    }
    void getwithdrawal(int amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("transaction"+amount+"success");
        }
        else
        {
            System.out.println("insufficient transaction");
        }
    }
    void display()
    {
        System.out.println(accountnumber);
        System.out.println(holdername);
        System.out.println(balance);

    }
}
class savingsaccount extends bankaccount
{
    int interestrate;
    savingsaccount(int accountnumber,String holdername,int balance,int interestrate)
    {
        super(accountnumber,holdername,balance);
        this.interestrate=interestrate;
    }
    void getdeposit(int amount)
    {
        int intrest=amount*interestrate/100;
        balance=balance+amount+intrest;
        System.out.println(balance);
    }
}
class checkingaccount extends bankaccount
{
    int overdraftlimit;
    checkingaccount(int accountnumber,String holdername,int balance,int overdraftlimit)
    {
        super(accountnumber,holdername,balance);
        this.overdraftlimit=overdraftlimit;
    }
    void getwithdrawal(int amount)
    {
        if(amount<=(balance+overdraftlimit))
        {
            balance=balance-(amount+overdraftlimit);
            System.out.println(balance);
        }
        else
        {
            System.out.println("exceeds");
        }
    }
}
class bank
{
    public static void main(String a[])
    {
        bankaccount b=new bankaccount(1000,"manasa",10000);
        b.getdeposit(500);
        b.getwithdrawal(200);
        b.display();

        savingsaccount s=new savingsaccount(100,"manasa",10000,5);
        s.getdeposit(1000);
        s.display();

        checkingaccount c=new checkingaccount(100,"manasa",10000,1000);
        c.getwithdrawal(500);
        c.display();
    }
}