abstract class sha
{
    int s;
    int r;
    int side;
    int radius;
   abstract void getarea();
   abstract void getvolume();  
}
class square extends sha
{
    int s;
    square()
    {
        s=4;
    }
   void getarea()
    {
        System.out.println(s*s);
    }
    void getvolume()
    {
        System.out.println("its 2d");
    }
}
class circle extends sha
{
    int r;
    circle()
    {
        r=2;
    }
    void getarea()
    {
        System.out.println(3.14*r*r);
    }
    void getvolume()
    {
        System.out.println("its 2d");
    }
}
class cube extends sha
{
    int side;
    cube()
    {
        side=6;
    }
    void getarea()
    {
        System.out.println(6*side*side);
    }
    void getvolume()
    {
        System.out.println(side*side*side);
    }

}
class sphere extends sha
{
    int radius;
    sphere()
    {
        radius=3;
    }
    void getarea()
    {
        System.out.println(4*3.14*radius*radius);
    }
    void getvolume()
    {
        System.out.println((4/3)*3.14*radius*radius*radius);
    }
}
class shape1
{
    public static void main(String a[])
    {
        square s=new square();
        System.out.println("square:");
        s.getarea();

        circle c=new circle();
          System.out.println("circle:");
        c.getarea();

        cube cu=new cube();
          System.out.println("cube:");
       
        cu.getarea();
        cu.getvolume();

        sphere sp=new sphere();
          System.out.println("sphere:");
        sp.getarea();
        sp.getvolume();
    }
}