package ejerciciosInterfaces.ejercicio1;

public class Principal {
    static Socio[] socios = new Socio[5];
    public static void main(String[] args) {
        for (int i = 0; i < socios.length; i++) {
            socios[i] = new Socio(i+1, 10, "ale");
        }
        System.out.println(socios[0].compareTo(socios[1]));
    }
}
