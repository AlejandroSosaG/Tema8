package ejercicios.ejercicio4;

public class Ejecutable {
    static Electrodomestico[] eletrodomesticos = new Electrodomestico[10];

    public static void main(String[] args) {
        incremento();
    }
    public static void incremento(){
        for (int i = 0; i < eletrodomesticos.length; i++) {
            eletrodomesticos[i].precioFinal();
            System.out.println(eletrodomesticos[i].precio);
        }
    }
    public static void total(){
        double total;
    }
}
