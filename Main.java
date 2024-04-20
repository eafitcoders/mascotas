import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        crearMascota();
        consultarMascotas();
        nombreEsteban();
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



    //Metodo para imprimir mi nombre (
    public static void nombreEsteban(){
        String name = "Esteban Molina";
        String grupo = " Grupo 3091 Viernes 6-9 am ";
        String documento = " 1034988238";
        System.out.println(name + grupo + documento );
        System.out.println(" Tareita 2");
    }



    static void eliminarMascotas() {
    }


}
