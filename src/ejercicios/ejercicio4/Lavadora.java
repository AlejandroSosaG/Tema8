package ejercicios.ejercicio4;

public class Lavadora extends Electrodomestico {
    double carga;

    public Lavadora(double precio, double peso, String color, char consumo, double carga) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }
    public Lavadora(){
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, double peso, double carga) {
        super(precio, peso);
        this.carga = 5;
    }
    public void precioFinal(){
        if (carga>30){
            precio += 50;
        }
        super.precioFinal();
    }
    public double getCarga() {
        return carga;
    }
}
