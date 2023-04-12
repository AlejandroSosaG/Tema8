package ejercicios.ejercicio1;

public class HoraExacta extends Hora{
    int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }
    public HoraExacta(){
    }

    public void setSegundos(int segundos) {
        if (segundos < 60 && segundos > -1)
            this.segundos = segundos;
    }
    public void inc(){
        if (segundos<59){
            this.segundos++;
        }else {
            super.inc();
        }
    }
}
