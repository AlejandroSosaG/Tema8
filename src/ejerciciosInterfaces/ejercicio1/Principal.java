package ejerciciosInterfaces.ejercicio1;

import java.util.Arrays;

public class Principal {
    static Socio[] socios = new Socio[5];
    public static void main(String[] args) {
        for (int i = 0; i < socios.length; i++) {
            socios[i] = new Socio(i+1, 10, "ale");
        }
        Arrays.sort(socios);
        for (int i = 0; i < socios.length; i++) {
            socios[i].toString();
        }
    }
}
