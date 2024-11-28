public class Square implements Shapes
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

    public double getArea()
    {
        return side*side;
    }

    public double getPerimeter() 
    {
        return 4 * side;
    }

    public void printShapeType() 
    {
        System.out.println("Square");
    }

    printShapeType();
    System.out.println("Area: " + Area);
    System.out.println("Perimeter: " + Perimeter);

}