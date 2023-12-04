import java.util.*;
class contractemployee
{
    String firstname;
    String lastname;
    String department;
    String designation;
    contractemployee(String fn,String ln,String dep,String des)
    {
        this.firstname=fn;
        this.lastname=ln;
        this.department=dep;
        this.designation=des;
    }
    String getdesignation()
    {
        return designation;
    }
}
class hourlyemployee extends contractemployee
{
     double hours;
    double wagesperhour;
    hourlyemployee(String firstname,String lastname,String department,String designation,int hou,double wagesper)
    {
        super(firstname,lastname,department,designation);
        this.hours=hou;
        this.wagesperhour=wagesper;
    }
    String getdesignation()
    {
        return super.designation;
    }
    double calculatewages()
        {
            return hours*wagesperhour*4;
        }
        void display()
        {
            System.out.println(firstname+" "+lastname+" "+department+" "+designation);
        }
}
class weeklyemployee extends contractemployee
{
    double weeks;
    double wagesperweek;
    weeklyemployee(String firstname,String lastname,String department,String designation,double wee,double wagesperwee)
    {
        super(firstname,lastname,department,designation);
       this.weeks=wee;
        this.wagesperweek=wagesperwee;
    }
    String getdesignation()
    {
        return super.designation;
    }
    double calculatewages()
        {
            return weeks*wagesperweek;
        }
         void display()
        {
            System.out.println(firstname+" "+lastname+" "+department+" "+designation);
        }
}
class contractemp
{
    public static void main(String a[])
    {  
    
        hourlyemployee h=new hourlyemployee("manasa","masthan","cse","hourlyemp",4,1000);
        weeklyemployee w=new weeklyemployee("deepthi","siripuram","csm","weeklyemp",2,10000);
        h.display();
       System.out.println(h.calculatewages());
       w.display();
       System.out.println(w.calculatewages());
      

    }
}