package ejercicios.ejercicio4;

public class Television extends Electrodomestico {
    double resolucion;
    boolean sincronizadorTDT;

    public Television() {
        super();
        this.resolucion = 20;
        this.sincronizadorTDT = false;
    }

    public Television(double precio, double peso, double resolucion, boolean sincronizadorTDT) {
        super(precio, peso);
        this.resolucion = 20;
        this.sincronizadorTDT = false;
    }

    public Television(double precio, double peso, String color, char consumo, double resolucion, boolean sincronizadorTDT) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }
    public void precioFinal(){
        super.precioFinal();
        if (resolucion>40){
            precio += (precio*30/100);
        }
        if (sincronizadorTDT){
            precio += 50;
        }
    }
    public double getResolucion() {
        return resolucion;
    }

    public boolean isSincronizadorTDT() {
        return sincronizadorTDT;
    }
}
