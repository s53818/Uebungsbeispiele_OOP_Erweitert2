package org.campus02.manager;

import org.campus02.figures.Figure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class FigureManager
{
    private ArrayList<Figure> figures = new ArrayList<>();
    public FigureManager()
    {
    }

    public void addFigure(Figure f)
    {
        figures.add(f);
    }

    public double getMaxPerimeter()
    {
        double maxPerimeter = figures.get(0).getPerimeter();
        for (Figure f : figures)
        {
            if(f.getPerimeter()>maxPerimeter)
            {
                maxPerimeter = f.getPerimeter();
            }
        }
        return maxPerimeter;
    }

    public double getAverageAreaSize()
    {
        double sum = 0;
        for (Figure f : figures)
        {
            sum += f.getArea();
        }
        return sum / figures.size();
    }

    public HashMap<String, Double> getAreaBySizeCategories()
    {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Klein", 0.0);
        hashMap.put("Mittel", 0.0);
        hashMap.put("Groß", 0.0);
        for (Figure f : figures)
        {
            if(f.getArea()<1000)
            {
                hashMap.put("Klein",hashMap.get("Klein")+f.getArea());
            }
            else if (f.getArea()>=1000 && f.getArea()<=4999)
            {
                hashMap.put("Mittel",hashMap.get("Mittel")+f.getArea());
            }
            else if(f.getArea()>=5000)
            {
                hashMap.put("Groß",hashMap.get("Groß")+f.getArea());
            }
        }
        return hashMap;
    }
}
