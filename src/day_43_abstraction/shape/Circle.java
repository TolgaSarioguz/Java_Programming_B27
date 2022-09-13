package day_43_abstraction.shape;

public class Circle extends Shape{

    public final double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area(){
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        String org = super.toString();
        return org.substring(0, org.indexOf("|")) + radius + org.substring(org.indexOf("|"));
    }

    // return name + " | radius Area: " + area() + " | Perimeter: " + perimeter();

}
/*
Create a concrete class Circle
    sub class of Shape

    create an instance variable radius

    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle

    implement the two abstract methods for a circle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, and radius
 */
