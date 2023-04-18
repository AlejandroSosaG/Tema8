package ejercicios.ejercicio4;

public class Ejecutable {
    static Electrodomestico[] eletrodomesticos = new Electrodomestico[10];

    public static void main(String[] args) {
        relleno();
        incremento();
        total();
    }
    public static void relleno(){
        for (int i = 0; i < eletrodomesticos.length; i+=3) {
            eletrodomesticos[i] = new Electrodomestico();
        }
        for (int i = 1; i < eletrodomesticos.length; i+= 3) {
            eletrodomesticos[i] = new Lavadora();
        }
        for (int i = 2; i < eletrodomesticos.length; i+= 3) {
            eletrodomesticos[i] = new Television();
        }
        for (int i = 0; i < eletrodomesticos.length; i++) {
            System.out.println(eletrodomesticos[i].getClass().getName());
        }
    }
    public static void incremento(){
        for (int i = 0; i < eletrodomesticos.length; i++) {
            eletrodomesticos[i].precioFinal();
            System.out.println(eletrodomesticos[i].precio);
        }
    }
    public static void total(){
        double total = 0, lavadora = 0, tele = 0;
        for (int i = 0; i < eletrodomesticos.length; i++) {
            total += eletrodomesticos[i].precio;
            if (eletrodomesticos[i] instanceof Lavadora){
                lavadora += eletrodomesticos[i].precio;
            }else if (eletrodomesticos[i] instanceof Television){
                tele += eletrodomesticos[i].precio;
            }
        }
        System.out.println("Electrodomésticos: " + total);
        System.out.println("Lavadoras: " + lavadora);
        System.out.println("Televisión: " + tele);
    }
}
