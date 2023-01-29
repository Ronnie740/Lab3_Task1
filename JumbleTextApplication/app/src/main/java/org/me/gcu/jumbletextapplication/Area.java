package org.me.gcu.jumbletextapplication;

public class Area {
    public double area(double x, double y){
        double totalArea =0;
        if(x > 0 && y > 0){
            totalArea = x * y;
        }
        if (x == 0  || y == 0){
            totalArea = 0.0;
        }
        return totalArea;
    }
}
