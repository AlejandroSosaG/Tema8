package ejercicios.ejercicio5;

public class Triangulo extends Poligono{
    double lado1, lado2, lado3;

    public Triangulo(int numLados, double lado1, double lado2, double lado3) {
        super(numLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public Triangulo(){
    }
    public double area(){
        double area, s;
        s = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return area;
    }
    public String toString(){
        return "Triángulo: lado 1 = " + lado1 + ", lado 3 = " + lado2 + ", lado 3 = " + lado3;
    }
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
}
