package ejerciciosInterfaces.ejercicio4;

import java.util.*;
public class Principal {
    static List<Animal> animales = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while (opc<7){
            System.out.println("1. Añadir perro.\n" +
                    "2. Añadir gato.\n" +
                    "3. Emitir ruido.\n" +
                    "4. Hacer caso.\n" +
                    "5. Sacar paseo.\n" +
                    "6. Toser bola de pelo.\n" +
                    "7. Salir.");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    añadePerro();
                    break;
                case 2:
                    añadeGato();
                    break;
                case 3:
                    emiteRuido();
                    break;
                case 4:
                    hacerCaso();
                    break;
                case 5:
                    pasear();
                    break;
                case 6:
                    toser();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    public static void añadePerro(){
        Perro perro = new Perro();
        animales.add(perro);
    }
    public static void añadeGato(){
        Gato gato = new Gato();
        animales.add(gato);
    }
    public static void emiteRuido(){
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).hacerRuido();
        }
    }
    public static void hacerCaso(){
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getClass().getName().equals("ejerciciosInterfaces.ejercicio4.Perro")){
                System.out.println(((Perro) animales.get(i)).hacerCaso());
            }
            else {
                System.out.println(((Gato) animales.get(i)).hacerCaso());
            }
        }
    }
    public static void pasear(){
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getClass().getName().equals("ejerciciosInterfaces.ejercicio4.Perro")){
                ((Perro) animales.get(i)).sacarPaseo();
            }
        }
    }
    public static void toser(){
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getClass().getName().equals("ejerciciosInterfaces.ejercicio4.Gato")){
                ((Gato) animales.get(i)).toserBolaPelo();
            }
        }
    }
}
