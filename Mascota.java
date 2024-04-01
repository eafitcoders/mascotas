public class Mascota {
    //atributos
    private String nombre;
    private String raza;
    private String tipo;
    private int edad;

    //métodos gettes and setters


    public Mascota(String nombre, String raza, String tipo, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
