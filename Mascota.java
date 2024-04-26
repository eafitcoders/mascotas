import java.util.concurrent.atomic.AtomicInteger;
public class Mascota {
    //atributos
    private static final AtomicInteger idGen = new AtomicInteger(0);
    private int id;
    private String nombre;
    private String raza;
    private String tipo;
    private int edad;
   
    //métodos gettes and setters


    public Mascota(String nombre, String raza, String tipo, int edad ) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.edad = edad;
        //this.id=getNextID();
    }



    public int getId() {
        return id;
    }

    public int getNextId(){
        int NextId=+1;
        return NextId;}

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

    public static void ponerNom (){
        System.out.println("Camilo Salazar");
        //grupo 2505
    }
}
