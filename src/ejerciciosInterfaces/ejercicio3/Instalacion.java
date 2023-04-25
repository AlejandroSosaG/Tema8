package ejerciciosInterfaces.ejercicio3;

public interface Instalacion {

    public default int getTipoDeInstalacion() {
        return 0;
    }
}
