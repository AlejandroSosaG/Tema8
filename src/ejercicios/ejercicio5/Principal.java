package ejercicios.ejercicio5;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Elija una opción:");
        System.out.println("1. Crear triángulo.");
        System.out.println("2. Crear rectángulo.");
        System.out.println("3. Mostrar contenido.");
        int opc = sc.nextInt();
    }
}
