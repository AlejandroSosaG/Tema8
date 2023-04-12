package ejercicios.ejercicio1;

public class Hora {
    int hora, minutos;

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }
    public Hora(){
    }
    public void inc(){
        if (minutos<59){
            minutos++;
        }else{
            minutos = 0;
            hora++;
        }
    }
    @Override
    public String toString() {
        return hora + ":" + minutos;
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        boolean set = false;
        if (hora<24 && hora>-1){
            this.hora = hora;
            set = true;
        }
        return set;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        boolean set = false;
        if (minutos<60 && minutos>-1){
            this.minutos = minutos;
            set = true;
        }
        return set;
    }
}
