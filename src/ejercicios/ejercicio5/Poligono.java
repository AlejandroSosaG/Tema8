package ejercicios.ejercicio5;

abstract class Poligono {
    int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public Poligono(){
    }
    abstract double area();
    @Override
    public String toString() {
        return "numLados = " + numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
}
