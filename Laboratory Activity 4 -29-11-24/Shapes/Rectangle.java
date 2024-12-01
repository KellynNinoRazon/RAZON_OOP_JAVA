public class Rectangle implements Shape
{
    private double length;
    private double width;
    private double Perimeter;
    private double Area;


    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
        this.Area= getArea();
        this.Perimeter=getPerimeter();
    }

    public double getArea()
    {
        return length*width;
    }

    public double getPerimeter() 
    {
        return (2*length)+(2*width);
    }

    public void printShapeType() 
    {
        System.out.println("Rectangle");
        System.out.println("Area: " + Area);
        System.out.println("Perimeter: " + Perimeter);
    }
}
