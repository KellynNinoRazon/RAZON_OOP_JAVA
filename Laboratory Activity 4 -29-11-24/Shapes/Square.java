public class Square implements Shape
{
    private double side;
    private double Area;
    private double Perimeter;

    public Square(double side)
    {
        this.side=side;
        this.Area= getArea();
        this.Perimeter=getPerimeter();
    }

    public double getArea(double side)
    {
        return side*side;
    }

    public double getPerimeter(double side) 
    {
        return 4 * side;
    }

    public void printShapeType() 
    {
        System.out.println("Square");
    }

    
    System.out.println("Area: " + Area);
    System.out.println("Perimeter: " + Perimeter);

}