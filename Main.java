import java.util.ArrayList;

public class Main {
    static ArrayList<Mascota> mascotas = new ArrayList<>();

    public static void main(String[] args) {
        crearMascota();
        consultarMascotas();

    }

    static void crearMascota() {
        Mascota m1 = new Mascota("Tobias", "Snouzer", "Canino", 5);
        mascotas.add(m1);// agregamos la mascota a las lista de mascotas
        Mascota m2 = new Mascota("Lilu", "Pequinez", "Canino", 15);
        mascotas.add(m2);// agregamos la mascota a las lista de mascotas
    }

    static void consultarMascotas() {
        System.out.println("----Lista de Mascotas--------");
        for (Mascota m : mascotas) {
            System.out.println(m.getNombre());
        }
    }

    static void eliminarMascotas() {
    }


    // Creación del método para llamar los métodos creados por todos los estudiantes
    static void imprimirNombres() {
        JuanMiguelRamirez();
        separador();
        LuisCastrillon();
        separador();
        MayerlyAlejandraSuarez();
        separador();
        Paula();
        separador();
        JuanEstebanZuluaga();
        separador();
        FelipeSolis();
        separador();
        AlejandroJaramilloRodriguez();
        separador();
        JoseAlejandroJimenezVasquez();
        separador();
        MariaAlejandraOcampo();
        separador();
        SimonMartinez();
        separador();
        ThomasBuitrago();
        separador();
        JuanSebastianRave();
        separador();
        NicolasOspinaTorres();
        separador();
        CesarMontoya();
        separador();
        JuanCamiloRamon();
    }

    // método para usado para crear una separación visible entre otros metodos en consola
    private static void separador() {
        System.out.println("----------------------------------------------------------------------------------------");
    }


    // De acá en adelante solo se encuentran los métodos creados por los estudiantes
    static void JuanMiguelRamirez() {
        System.out.println("Juan Miguel Ramirez");
    }

    static void LuisCastrillon() {
        System.out.println("Mi nombre es: Luis Castrillon ");
    }

    static void MayerlyAlejandraSuarez() {
        System.out.println("Estudiante:");
        System.out.println("Mayerly Alejandra Suarez Sepulveda\n");
    }

    static void Paula() {
        System.out.println("Modificado por: Paula");
    }

    static void JuanEstebanZuluaga() {
        System.out.println("Nombre: Juan Esteban Zuluaga Quintero ");
        System.out.println("Número de documento: 1036252594");
    }

    static void FelipeSolis() {
        System.out.println("Mi nombre es: Felipe Solis");
    }

    static void AlejandroJaramilloRodriguez() {
        System.out.println("Nombre: Alejandro Jaramillo Rodriguez");
        System.out.println("Número de documento: 1027800088");
        System.out.println("Grupo: Viernes 9-12m");

    }

    static void JoseAlejandroJimenezVasquez() {
        System.out.println("Nombre: Jose Alejandro Jimenez Vasquez");
        System.out.println("Número de documento: 1020302386");
        System.out.println("Grupo: Jueves 9-12m");
    }

    static void MariaAlejandraOcampo() {
        System.out.println("Nombre: Maria Alejandra Ocampo Giraldo");
        System.out.println("Número de documento: 1036928998");
        System.out.println("Grupo: Jueves 9-12am");
    }

    static void SimonMartinez() {
        System.out.println("Nombre: Simon Martinez");
        System.out.println("Número de documento: 1001367561");
        System.out.println("Grupo: miercoles 9-12am");

    }

    static void ThomasBuitrago() {
        System.out.println("Nombre: Thomas Buitrago Uribe");
        System.out.println("Número de documento: 1000409680");
        System.out.println("Grupo: viernes 9-12 am");
    }

    static void JuanSebastianRave() {
        System.out.println("Nombre: Juan Sebastián Rave Martínez");
        System.out.println("Número de documento: 1023628594");
        System.out.println("Grupo: miercoles 9-12am");
    }

    static void NicolasOspinaTorres() {
        System.out.println("Estudiante: Nicolás Ospina Torres");
        System.out.println("Grupo: Lenguajes de Programación 3324");
    }

    static void CesarMontoya() {
        System.out.println("Cesar Montoya"); // El pull request fue pedido por Cesar Montoya del grupo 3324
    }

    public static void JuanCamiloRamon() {
        System.out.println("Mi nombre es: Juan Camilo Ramón Pérez");
    }

}
