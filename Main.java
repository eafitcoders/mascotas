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

    //Metodo para imprimir mi nombre
    static void nombre(){
        System.out.println("Nombre: Samuel Deossa Gomez");
        System.out.println("Número de documento: 1023593101");
        System.out.println("Grupo: Jueves 9-12m");
    }



    static void eliminarMascotas() {
    }

<<<<<<< Updated upstream
=======
    static void imprimirNombreC(){
        System.out.println("Cesar Montoya");
        //El pull request fue pedido por Cesar Montoya del grupo 3324

    }

    public static void nombreJuan() {
        System.out.println("Mi nombre es: Juan Camilo Ramón Pérez");
    }

    public static void nombre() {
        System.out.println("Juan Camilo Ramón Pérez");
    }

    static void NOMBRESDG() {
        System.out.println("Nombre: Samuel Deossa Gomez");
        System.out.println("Número de documento: 1023593101");
        System.out.println("Grupo: Jueves 9-12am");

        }
>>>>>>> Stashed changes

}
