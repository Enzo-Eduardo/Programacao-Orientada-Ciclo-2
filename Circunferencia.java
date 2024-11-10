package Geometrico;

public class Circunferencia extends ObjetoGeometrico {
    private double raio;

    Circunferencia(double r) {
        raio = r;
    }

    public double getArea() {
        area = Math.PI * raio * raio;
        return area;
    }
}

