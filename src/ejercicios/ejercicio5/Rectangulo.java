package ejercicios.ejercicio5;

public class Rectangulo extends Poligono{
    double lado1, lado2;

    public Rectangulo(int numLados, double lado1, double lado2) {
        super(numLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Rectangulo(){
    }
    public double area(){
        double area;
        area = (lado1*lado2);
        return area;
    }
    public String toString(){
        return "Rectángulo: lado 1 = " + lado1 + ", lado 2 = " + lado2;
    }
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
}
