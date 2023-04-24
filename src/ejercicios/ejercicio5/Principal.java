package ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static List<Poligono> poligonos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int opc = 0;
        while (opc < 4) {
            System.out.println("Elija una opción:");
            System.out.println("1. Crear triángulo.");
            System.out.println("2. Crear rectángulo.");
            System.out.println("3. Mostrar contenido.");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    crearTriangulo();
                    break;
                case 2:
                    crearRectangulo();
                    break;
                case 3:
                    mostrar();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
    public static void crearTriangulo(){
        System.out.println("Introduzca los datos del triángulo(lado1, lado2, lado3)");
        Triangulo triangulo = new Triangulo(3, sc.nextInt(), sc.nextInt(), sc.nextInt());
        poligonos.add(triangulo);
    }
    public static void crearRectangulo(){
        System.out.println("Introduzca los datos del rectángulo(lado1, lado2)");
        Rectangulo rectangulo = new Rectangulo(2, sc.nextInt(), sc.nextInt());
        poligonos.add(rectangulo);
    }
    public static void mostrar(){
        for (int i = 0; i < poligonos.size(); i++) {
            System.out.println(poligonos.get(i).toString() + ", área: " + poligonos.get(i).area());
        }
    }
}
