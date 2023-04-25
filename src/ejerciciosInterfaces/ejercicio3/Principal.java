package ejerciciosInterfaces.ejercicio3;

public class Principal {
    static Object[] array = new Object[5];

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            array[i] = new Polideportivo();
        }
        for (int i = 3; i < array.length; i++) {
            array[i] = new EdificioOficinas();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getClass());
        }
    }
}
