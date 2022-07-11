package entidades;

public class Socio {
    private int numero;
    private String nombre;
    private int cantDisciplinas; //1: una disciplina, 2: dos disciplinas, 3: pase libre
    private int accesoPileta; //1: SI, 2: NO

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantDisciplinas() {
        return cantDisciplinas;
    }

    public void setCantDisciplinas(int cantDisciplinas) {
        this.cantDisciplinas = cantDisciplinas;
    }

    public int getAccesoPileta() {
        return accesoPileta;
    }

    public void setAccesoPileta(int accesoPileta) {
        this.accesoPileta = accesoPileta;
    }

    public Socio(int numero, String nombre, int cantDisciplinas, int accesoPileta) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantDisciplinas = cantDisciplinas;
        this.accesoPileta = accesoPileta;
    }

    public Socio() {
    }

    @Override
    public String toString() {
        return "Socio{" + "numero=" + numero + ", nombre=" + nombre + ", cantDisciplinas=" + cantDisciplinas + ", accesoPileta=" + accesoPileta + '}';
    }
    
    
}
