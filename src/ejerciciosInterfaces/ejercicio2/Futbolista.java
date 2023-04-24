package ejerciciosInterfaces.ejercicio2;

public class Futbolista {
    int numCamiseta, edad, numGoles;
    String nombre;

    public Futbolista(int numCamiseta, int edad, int numGoles, String nombre) {
        this.numCamiseta = numCamiseta;
        this.edad = edad;
        this.numGoles = numGoles;
        this.nombre = nombre;
    }
    public Futbolista(){
    }
    @Override
    public String toString() {
        return "Futbolista: " +
                "numCamiseta = " + numCamiseta +
                ", edad = " + edad +
                ", numGoles = " + numGoles +
                ", nombre = " + nombre;
    }
}
