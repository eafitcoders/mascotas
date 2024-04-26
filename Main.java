import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        nombreJose();
        simonMartinez();
        crearMascota();
        consultarMascotas();
        imprimirnombre();
        JJRR();
        imprimirMiNombre();
        printName();
        nombreFelipe();
        nuevoNombre();
        thomasBuitrago();
        ElMaestrotic2();
        MiNombre();
        Minamedavid();

    }

    static void imprimirnombre() {
        System.out.println("Juan Miguel Ramirez");
    }

    static void nombreJose() {
        System.out.println("Nombre: Jose ");
    }

    static void crearMascota() {
        Mascota m1 = new Mascota("Tobias", "Snouzer", "Canino", 5);
        mascotas.add(m1);
        Mascota m2 = new Mascota("Lilu", "Pequinez", "Canino", 15);
        mascotas.add(m2);
    }

    static void consultarMascotas() {
        System.out.println("----Lista de Mascotas--------");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre());
        }
    }

    static void imprimirMiNombre() {
        System.out.println("Mi nombre es: Luis Castrillon ");
    }

    public static void JJRR() {
        System.out.println("======================================");
        System.out.println("Nombre: Juan José Rodríguez Restrepo");
        System.out.println("C.C: 1036449192");
        System.out.println("Grupo: Jueves 9am-12pm");
        System.out.println("======================================");
    }

    static void printName() {
        System.out.println("Modificado por: Paula");
    }

    static void nombreFelipe() {
        System.out.println("Tarea 2");
        String nombre = "Nombre: Felipe Ochoa Lotero";
        String group = "Número de documento: 1000409803";
        String documento = "Grupo:3091 Viernes 6-9am";
        System.out.println(nombre + group + documento);
    }

    static void nuevoNombre() {
        System.out.println("Nombre: Maria Alejandra Ocampo Giraldo");
        System.out.println("Número de documento: 1036928998");
        System.out.println("Grupo: Jueves 9-12am");
    }

    static void simonMartinez() {
        System.out.println("Nombre: Simon Martinez");
        System.out.println("Número de documento: 1001367561");
        System.out.println("Grupo: miercoles 9-12am");
    }

    static void thomasBuitrago() {
        System.out.println("Nombre: Thomas Buitrago Uribe");
        System.out.println("Número de documento: 1000409680");
        System.out.println("Grupo: viernes 9-12 am");
    }

    static void ElMaestrotic2() {
        System.out.println("------------------------------------------------------");
        System.out.println("Je mapelle Martin Vanegas Ospina et j'ai 18 ans");
        Mascota g1 = new Mascota("Colmillo", "Cruce", "Felino", 2);
        mascotas.add(g1);
        System.out.println("Mi mascota se llama: " + g1.getNombre());
        System.out.println("Favorite tv show: How I Met Your Mother ");
        System.out.println("Grupo: Jueves 9-12m");
    }

    static void MiNombre() {
        System.out.println("Nombre: Juan Pablo Corena Álvarez");
        System.out.println("Número: 1126644465");
        System.out.println("Grupo: Jueves 9-12");
    }

    static void Minamedavid() {
        System.out.println("Name: david zapata");
        System.out.println("CC: 1033256721");
        System.out.println("dia: viernes 9-12");
    }
}