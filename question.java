import java.util.*;
abstract class testquestion
{
    String text;
    int value;
    abstract boolean iscorrect(int user);
    public testquestion(String text,int value)
    {
        this.text=text;
        this.value=value;
    }
    public String gettext()
    {
        return text;
    }
    public int getvalue()
    {
        return value;
    }

}
class multichoice extends testquestion
{
    String[] choices;
    int index;
    public multichoice(String text,int value,String[] choices,int index)
    {
        super(text,value);
        this.choices=choices;
        this.index=index;
    }
    public boolean iscorrect(int user)
    {
        return user==index;
    }
    public void displaychoices()
    {
        for(int i=0;i<choices.length;i++)
        {
            System.out.println((i+1)+" "+choices[i]);
        }
    }
}
class question
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter multiple choice questions:");
        int numquestions=sc.nextInt();
        sc.nextLine();

        testquestion[] questions = new multichoice[numquestions];

        for(int i=0;i<numquestions;i++)
        {
            System.out.println("enter detail for question" +(i+1)+": ");
            System.out.print("Question text: ");
            String text = sc.nextLine();
            System.out.print("Point value: ");
            int value=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the number of choices: ");
            int numchoices=sc.nextInt();
            sc.nextLine();

            String[] choices=new String[numchoices];
            for(int j=0;j<numchoices;j++)
            {   
                System.out.print("Choice " + (j + 1) + ": ");
                choices[i]=sc.nextLine();
            }
             System.out.print("Index of correct choice (1-" + numchoices + "): ");
             int index=sc.nextInt();
             sc.nextLine();
           questions[i] = new multichoice(text,value,choices,index-1);
        }
        int total=0;
        for(testquestion question: questions)
        {
            multichoice multichoicequestion = (multichoice)question;

            System.out.println("\n" + multichoicequestion.gettext());
            multichoicequestion.displaychoices();
            System.out.println("your answer:");
             int user = sc.nextInt();

             if (question.iscorrect(user-1)) {
                System.out.println("Correct!"+question.value);
                total=total+question.getvalue();
            } 
            else 
            {
                System.out.println("Incorrect");
            }
        }

 System.out.println("\nTotal points earned: " + total);


    }
}
