package ejerciciosInterfaces.ejercicio4;

public class Gato extends AnimalDomestico{
    public Gato(String nombre, String raza, String color, double peso) {
        super(nombre, raza, color, peso);
    }

    public Gato() {
    }
    @Override
    public void hacerRuido(){
        System.out.println("Miau");
    }
    public static boolean hacerCaso(){
        boolean caso = true;
        if (Math.round(Math.random()*100)>=95)
            caso = false;
        return caso;
    }
    public static void toserBolaPelo(){
        System.out.println("El gato ha tosido una bola de pelo.");
    }
}
