package ejerciciosInterfaces.ejercicio1;

public class Socio implements Comparable{
    int id, edad;
    String nombre;

    public Socio(int id, int edad, String nombre) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }
    public Socio(){
    }

    @Override
    public String toString() {
        return "Socio:" +
                "id = " + id +
                ", edad = " + edad +
                ", nombre = '" + nombre;
    }

    @Override
    public int compareTo(Object o) {
        int pos;
        Socio s = (Socio) o;
        if (this.id == s.id){
            pos = 0;
        }else if (this.id < s.id){
            pos = -1;
        }else pos = 1;
        return pos;
    }
}
