class Rec9
{
    double width=1;
    double height=1;
    Rec9()
    {
          
    }

    Rec9(double w, double h)
    {
        width=w;
        height=h;
    }
 
    double getArea()
    {
        return(width * height);
    }
     
    double getPerimeter()
    {
        return 2*(width + height);
    }
 
    public static void main(String []args)
    {
        Rec9 r1=new Rec9();
        System.out.println("Area of Rectangle: "+r1.getArea());
        System.out.println("Perimeter of Rectangle: "+r1.getPerimeter());

        Rec9 r2=new Rec9(20,40);
        System.out.println("Area of Rectangle: "+r2.getArea());
        System.out.println("Perimeter of Rectangle: "+r2.getPerimeter());
    }
}