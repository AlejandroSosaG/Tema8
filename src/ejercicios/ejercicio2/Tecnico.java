package ejercicios.ejercicio2;

public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }
    public Tecnico(){
    }
    @Override
    public String toString() {
        return "Tecnico " + super.getNombre() + " --> Operario --> Empleado";
    }
}
