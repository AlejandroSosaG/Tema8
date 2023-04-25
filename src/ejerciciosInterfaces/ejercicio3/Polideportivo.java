package ejerciciosInterfaces.ejercicio3;

public class Polideportivo implements Edificio {
    String nombre;
    double superficie;
    public Polideportivo(double superficie, String nombre) {
        this.nombre = nombre;
        this.superficie = superficie;
    }
    public Polideportivo(){
    }
    @Override
    public double getSuperficieEdificio(){
        return superficie;
    }
    public String getNombre() {
        return nombre;
    }
}
