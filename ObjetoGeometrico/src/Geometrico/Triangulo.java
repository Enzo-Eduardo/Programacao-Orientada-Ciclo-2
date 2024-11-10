package Geometrico;

public class Triangulo extends ObjetoGeometrico {
    private double base;
    private double altura;

    Triangulo(double b, double a) {
        base = b;
        altura = a;
    }

    public double getArea() {
        area = (base * altura) / 2;
        return area;
    }
}

