package ejerciciosInterfaces.ejercicio2;

import ejerciciosInterfaces.ejercicio1.Socio;

import java.util.Objects;

public class Futbolista implements Comparable{
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
    @Override
    public boolean equals(Object o) {
        boolean igual = false;
        Futbolista f = (Futbolista) o;
        if (this.numCamiseta == f.numCamiseta && this.nombre == f.nombre)
            igual = true;
        return igual;
    }
    @Override
    public int compareTo(Object o) {
        int pos;
        Futbolista f = (Futbolista) o;
        if (this.numCamiseta == f.numCamiseta){
            pos = this.nombre.compareTo(f.nombre);
        }else if (this.numCamiseta < f.numCamiseta){
            pos = -1;
        }else pos = 1;
        return pos;
    }
}
