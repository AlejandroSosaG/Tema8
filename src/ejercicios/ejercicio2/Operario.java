package ejercicios.ejercicio2;

public class Operario extends Empleado{
    public Operario(String nombre) {
        super(nombre);
    }
    public Operario(){
    }
    @Override
    public String toString() {
        return "Operario " + super.getNombre() + " --> Empleado";
    }
}
