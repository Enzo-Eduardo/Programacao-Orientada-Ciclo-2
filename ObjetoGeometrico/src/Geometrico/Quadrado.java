package Geometrico;

public class Quadrado extends ObjetoGeometrico {
    private double lado;

    Quadrado(double l) {
        lado = l;
    }

    public double getArea() {
        area = lado * lado;
        return area;
    }
}

