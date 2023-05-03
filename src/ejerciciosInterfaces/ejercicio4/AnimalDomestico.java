package ejerciciosInterfaces.ejercicio4;

public class AnimalDomestico implements Animal{
    String nombre, raza, color;
    double peso;

    public AnimalDomestico(String nombre, String raza, String color, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
    }
    public AnimalDomestico(){
    }
    public static void vacunar(){

    }
    public static boolean hacerCaso(){
        return false;
    }
}
