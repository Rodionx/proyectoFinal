
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funciones f = new Funciones();
        ArrayList<Coche> coches = new ArrayList<>();

        f.mensaje();

        int opcion = sc.nextInt();
        boolean salir = false;

        f.leerFichero(coches);

        while (!salir){
            switch(opcion){
                case 1:
                    f.insertarDatos(coches);
                    f.mensaje();
                    opcion = sc.nextInt();
                    break;
                case 2:
                    f.lista(coches);
                    f.mensaje();
                    opcion = sc.nextInt();
                    break;
                case 3:
                    f.modificarP(coches);
                    f.mensaje();
                    opcion = sc.nextInt();
                    break;
                case 4:
                    f.eliminarP(coches);
                    f.mensaje();
                    opcion = sc.nextInt();
                    break;
                case 5:
                    f.escribirFichero(coches);
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}