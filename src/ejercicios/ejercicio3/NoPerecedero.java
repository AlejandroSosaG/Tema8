package ejercicios.ejercicio3;

public class NoPerecedero extends Producto{
    String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    public NoPerecedero(){
    }
    public double calcular(int num){
        return super.calcular(num);
    }
    @Override
    public String toString() {
        return "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
