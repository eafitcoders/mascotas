import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        crearMascota();
        consultarMascotas();
        nombre();
        nuevoNombre();
    }


    static void crearMascota() {
        Mascota m1 = new Mascota("Tobias", "Snouzer", "Canino", 5);
        mascotas.add(m1);//agregamos la cascota a las lista de mascotas
        Mascota m2 = new Mascota("Lilu", "Pequinez", "Canino", 15);
        mascotas.add(m2);//agregamos la cascota a las lista de mascotas
    }

    static void consultarMascotas() {
        System.out.println("----Lista de Mascotas--------");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre());
        }
    }

    //Metodo para imprimir mi nombre
    static void nombre(){
        System.out.println("Nombre: Sofía Isaareth Flores Suárez");
        System.out.println("Número de documento: 1127626894");
        System.out.println("Grupo: Viernes 9-12m");
    }

    static void nuevoNombre() {
        System.out.println("Nombre: Maria Alejandra Ocampo Giraldo");
        System.out.println("Número de documento: 1036928998");
        System.out.println("Grupo: Jueves 9-12am");
    }



    static void eliminarMascotas() {
    }


}
