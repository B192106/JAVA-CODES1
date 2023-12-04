interface student
{
    abstract void getamount();
    abstract void getfirstname();
    abstract void getlastname();
    abstract void getaddress();
    abstract void getcontact();
}
class nonhostler implements student
{
    String firstname;
    String lastname;
    String address;
    int amount;
    int contact;
    public void nonhostler(String firstname,String lastname,String address,int amount,int contact)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.amount=amount;
        this.contact=contact;
    }
    public void getfirstname()
    {
        System.out.println(firstname);
    }
    public void getlastname()
    {
        System.out.println(lastname);
    }
    public void getaddress()
    {
        System.out.println(address);
    }
    public void getamount()
    {
        System.out.println(amount);
    }
    public void getcontact()
    {
        System.out.println(contact);
    }
}
class hostler implements student
{
    String firstname;
    String lastname;
    String address;
    int amount;
    int hostelfee;
    int contact;
    public void hostler(String firstname,String lastname,String address,int amount,int hostelfee,int contact)
    {
         this.firstname=firstname;
        this.lastname=lastname;
        this.address=address;
        this.amount=amount;
        this.hostelfee=hostelfee;
        this.contact=contact;
    }
    public void getfirstname()
    {
        System.out.println(firstname);
    }
    public void getlastname()
    {
        System.out.println(lastname);
    }
    public void getaddress()
    {
         System.out.println(address);
    }
    public void getamount()
    {
        System.out.println(amount+hostelfee);
    }
    public void getcontact()
    {
        System.out.println(contact);
    }
}
class studentfee
{
    public static void main(String a[])
    {
        nonhostler n=new nonhostler();
        n.nonhostler("manasa","masthan","jakkapur",10000,99513);
        n.getfirstname();
        n.getlastname();
        n.getaddress();
        n.getamount();
        n.getcontact();

        hostler h=new hostler();
        h.hostler("nithin","masthan","basar",10000,500,99635);
        h.getfirstname();
        h.getlastname();
        h.getaddress();
        h.getamount();
        h.getcontact();
    }
}
