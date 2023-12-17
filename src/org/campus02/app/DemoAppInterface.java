package org.campus02.app;

import org.campus02.figures.Circle;
import org.campus02.figures.Rectangle;
import org.campus02.manager.FigureManager;

import java.util.HashMap;

public class DemoAppInterface
{
    public static void main(String[] args)
    {
        System.out.println("Rechteck");
        Rectangle r = new Rectangle(4,3);
        System.out.println("Umfang: "+r.getPerimeter());
        System.out.println("Fläche: "+r.getArea());
        System.out.println();
        System.out.println("Kreis");
        Circle c = new Circle(5);
        System.out.println("Umfang: "+c.getPerimeter());
        System.out.println("Fläche: "+c.getArea());

        FigureManager fm = new FigureManager();
        fm.addFigure(r);
        fm.addFigure(c);

        System.out.println(fm.getMaxPerimeter());
        System.out.println(fm.getAverageAreaSize());

        System.out.println("\nHashmap");
        Rectangle r1 = new Rectangle(34,54);
        Rectangle r2 = new Rectangle(74,23.54);
        Rectangle r3 = new Rectangle(65.3,87);
        Rectangle r4 = new Rectangle(12.67,19);
        Rectangle r5 = new Rectangle(89.3,98);
        Rectangle r6 = new Rectangle(1,64.64);
        Rectangle r7 = new Rectangle(43,23.57);
        fm.addFigure(r1);
        fm.addFigure(r2);
        fm.addFigure(r3);
        fm.addFigure(r4);
        fm.addFigure(r5);
        fm.addFigure(r6);
        fm.addFigure(r7);

        HashMap<String, Double> hm = fm.getAreaBySizeCategories();

        for (String category : hm.keySet())
        {
            System.out.println(category + ": " + hm.get(category));
        }
    }
}
