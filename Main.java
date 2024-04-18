import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        crearMascota();
        consultarMascotas();
        nombre();
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

    static void nombre() {
        System.out.println("Nombre del dueño: Juan Manuel Castellanos");
        System.out.println("Cedula de ciudadania: 1011393625");
        System.out.println("Direccion de residencia: Cra 24 #43A-87");
        System.out.println("Grupo: Jueves 9am a 12am");
    }



    static void eliminarMascotas() {
    }


}
