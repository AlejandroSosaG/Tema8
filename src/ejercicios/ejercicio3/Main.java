package ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("a", 10);
        productos[1] = new Perecedero("b", 10, 3);
        productos[2] = new NoPerecedero("c", 10, "comida");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i].calcular(5));
        }
    }
}
