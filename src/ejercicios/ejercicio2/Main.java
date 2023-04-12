package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Rafa");
        Directivo d = new Directivo("Mario");
        Operario o = new Operario("Alfonso");
        Oficial of = new Oficial("Luis");
        Tecnico t = new Tecnico("Pablo");
        System.out.println(e.toString());
        System.out.println(d.toString());
        System.out.println(o.toString());
        System.out.println(of.toString());
        System.out.println(t.toString());
    }
}
