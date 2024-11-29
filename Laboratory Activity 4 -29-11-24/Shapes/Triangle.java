public class Triangle implements Shape
{
    private double a;
    private double b;
    private double c;
    private double s;
    private double Perimeter;
    private double Area;

    public Triangle(double a, double b, double c)
    {
        this.a=a;
        this.b= b;
        this.c=c;
        this.s=(a+b+c)/2;
        this.Perimeter=getPerimeter();
        this.Area=getArea();
    }

    public double getArea(double a,double b, double c)
    {
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter(double a,double b, double c) 
    {
        return a+b+c;
    }

    public void printShapeType() 
    {
        System.out.println("Triangle");
    }

    
    System.out.println("Area: " + Area);
    System.out.println("Perimeter: " + Perimeter);
}
