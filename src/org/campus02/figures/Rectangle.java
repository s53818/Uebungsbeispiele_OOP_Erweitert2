package org.campus02.figures;

public class Rectangle extends Figure
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getPerimeter()
    {
        return (length+width)*2;
    }
    @Override
    public double getArea()
    {
        return length*width;
    }
}
