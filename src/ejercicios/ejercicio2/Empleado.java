package ejercicios.ejercicio2;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    public Empleado(){
    }
    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
