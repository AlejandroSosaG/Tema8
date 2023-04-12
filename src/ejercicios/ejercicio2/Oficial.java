package ejercicios.ejercicio2;

public class Oficial extends Operario{
    public Oficial(String nombre) {
        super(nombre);
    }
    public Oficial(){
    }
    @Override
    public String toString() {
        return "Oficial " + super.getNombre() + " --> Operario --> Empleado";
    }
}
