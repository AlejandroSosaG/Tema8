package ejerciciosInterfaces.ejercicio4;

public class Perro extends AnimalDomestico{
    public Perro(String nombre, String raza, String color, double peso) {
        super(nombre, raza, color, peso);
    }

    public Perro() {
    }
    @Override
    public void hacerRuido(){
        System.out.println("Guau");
    }

    public static boolean hacerCaso(){
        boolean caso = true;
        if (Math.round(Math.random()*100)>=90)
            caso = false;
        return caso;
    }
    public static void sacarPaseo(){
        System.out.println("El perro está dando un paseo.");
    }
}
