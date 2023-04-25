package ejerciciosInterfaces.ejercicio3;

public class EdificioOficinas implements Edificio{
    int numEdificios;

    public EdificioOficinas(double superficie, int numEdificios) {
        this.numEdificios = numEdificios;
    }
    public EdificioOficinas(){
    }

    public int getNumEdificios() {
        return numEdificios;
    }
}
