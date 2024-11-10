package Geometrico;

public class QuadroNegro {

 private Quadrado quadrado;
 private Retangulo retangulo;
 private Circunferencia circunferencia;
 private Triangulo triangulo;

 public void limpaQuadro() {
 }

 public void criaQuadrado(double l) {
     quadrado = new Quadrado(l);
 }

 public void criaRetangulo(double c, double a) {
     retangulo = new Retangulo(c, a);
 }

 public void criaCircunferencia(double r) {
     circunferencia = new Circunferencia(r);
 }

 public void criaTriangulo(double b, double a) {
     triangulo = new Triangulo(b, a);
 }

 public void mostraAreaObjetos() {
     System.out.println("Quadrado. Área: " + quadrado.getArea());
     System.out.println("Retângulo. Área: " + retangulo.getArea());
     System.out.println("Triângulo. Área: " + triangulo.getArea());
     System.out.println("Circunferência. Área: " + circunferencia.getArea());
 }

 public void mostraPerimetroObjetos() {
 }

 public void mostraCorObjetos() {
 }

 public static void main(String[] args) {
     QuadroNegro quadroNegro = new QuadroNegro();

     quadroNegro.criaQuadrado(10.6);
     quadroNegro.criaRetangulo(50.5, 20.4);
     quadroNegro.criaTriangulo(6.7, 5.5);
     quadroNegro.criaCircunferencia(10);

     quadroNegro.mostraAreaObjetos();
 }
}
abstract class ObjetoGeometrico {
 protected double area;
 protected String cor;

 public abstract double getArea();
}
class Quadrado extends ObjetoGeometrico {
 private double lado;

 Quadrado(double l) {
     this.lado = l;
 }
 public double getArea() {
     area = lado * lado;
     return area;
 }
}
class Circunferencia extends ObjetoGeometrico {
 private final double pi = 3.141618;
 private double raio;

 Circunferencia(double r) {
     this.raio = r;
 }
 public double getArea() {
     area = pi * (raio * raio);
     return area;
 }
}
class Retangulo extends ObjetoGeometrico {
 private double comprimento;
 private double altura;

 Retangulo(double c, double a) {
     this.comprimento = c;
     this.altura = a;
 }
 public double getArea() {
     area = comprimento * altura;
     return area;
 }
}
class Triangulo extends ObjetoGeometrico {
 private double base;
 private double altura;

 Triangulo(double b, double a) {
     this.base = b;
     this.altura = a;
 }
 public double getArea() {
     area = (base * altura) / 2;
     return area;
 }
}
