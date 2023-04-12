package ejercicios.ejercicio3;

public class Perecedero extends Producto{
    int diasACaducar;

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }
    public Perecedero(){
    }
    public double calcular(int num){
        double total = super.calcular(num);
        switch (diasACaducar){
            case 1:
                total -= 4;
                break;
            case 2:
                total -= 3;
                break;
            case 3:
                total /= 2;
                break;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasACaducar=" + diasACaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }
}
