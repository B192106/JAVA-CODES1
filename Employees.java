class Employe
{
    static String firstname;
    static String lastname;
    void setfullname(String f,String l)
    {
        this.firstname=f;
        this.lastname=l;
    }
    String getfirstname()
    {
        return firstname;
    }
    String getlastname()
    {
        return lastname;
    }

}
class contractemployee extends Employe
{
    String department;
    String designation;
    int salary;
    void displayfullname()
    {
      System.out.println(Employe.firstname+" "+Employe.lastname);
    }
    void setdepart(String d ,String de,int sal)
    {
        this.department=d;
        this.designation=de;
        this.salary=sal;
    }
    String getdepartment()
    {
        return department;
    }
    String getdesignation()
    {
        return designation;
    }
    int getsalary()
    {
        return salary;
    }


}
class regularemployee extends Employe
{
     String department;
    String designation;
    int salary;
    void displayfullname()
    {
      System.out.println(Employe.firstname+" "+Employe.lastname);
    }
     void setdepart(String d ,String de,int sal)
    {
        this.department=d;
        this.designation=de;
        this.salary=sal;
    }
    String getdepartment()
    {
        return department;
    }
    String getdesignation()
    {
        return designation;
    }
    int getsalary()
    {
        return salary;
    }
}
class Employees
{
    public static void main(String a[])
    {
        Employe e=new Employe();
        e.setfullname("manasa","masthan");
        //e1.setfullname("siripuram","deepthi");
          //c.displayfullname();
        contractemployee c=new contractemployee();
        c.setdepart("cse","professor",10000);
          c.displayfullname();
          System.out.println(c.getdepartment()+" "+c.getdesignation()+" "+c.getsalary());
  
        Employe k=new Employe();
         k.setfullname("siripuram","deepthi");

        regularemployee r=new regularemployee();
        r.setdepart("ece","teacher",1000);

        e.getfirstname();
        e.getlastname();
       // e.displayfullname();

       // c.displayfullname();
        //c.getdepartment();
        //c.getdesignation();
        //c.getsalary();
        //c.display();

        r.displayfullname();
        //r.getdepartment();
        //r.getdesignation();
        //r.getsalary();
       // r.display();

  //  System.out.println(c.getdepartment()+" "+c.getdesignation()+" "+c.getsalary());
    System.out.println(r.getdepartment()+" "+r.getdesignation()+" "+r.getsalary());

    }
}