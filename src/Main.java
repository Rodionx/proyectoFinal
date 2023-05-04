import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mensaje();

        int opcion = sc.nextInt();
        boolean salir = false;

        while (!salir){
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    //falta guardar en fichero.
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }

    public static void mensaje(){
        System.out.println("Selecciona una opcion: \n" +
                "1-Introducir coche nuevo.\n" +
                "2-Listado de coches\n" +
                "3-Modificar parametros\n" +
                "4-Salir y guardar\n");
    }




}