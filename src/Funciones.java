import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {

    public static void mensaje(){
        System.out.println("\nSelecciona una opcion: \n" +
                "\n1-Introducir coche nuevo.\n" +
                "2-Listado de coches\n" +
                "3-Modificar parametros\n" +
                "4-Eliminar vehiculo\n" +
                "5-Salir y guardar\n");
    }

    public static void insertarDatos(ArrayList<Coche> coches){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce el numero de matricula del coche: ");
        String matricula = sc.nextLine();
        System.out.println("Introduce la marca del coche: ");
        String coche = sc.nextLine();
        System.out.println("Introduce el tiempo de estacionamiento en minutos si el coche finalizo su estacionamiento si no introduce 0: ");
        double minutos = sc2.nextDouble();
        boolean estacionado;

        if (minutos == 0){
            estacionado = true;
        } else {
            estacionado = false;
        }

        double precio = minutos * 0.05;

        coches.add(new Coche(matricula, coche, minutos, precio, estacionado));
    }

    public static void escribirFichero(ArrayList<Coche> coches){
        File fichero;
        fichero = new File("/Users/Rodion/Desktop/Ficherito2.txt");
        try {
            FileWriter fw = new FileWriter(fichero);

            for (Coche coche : coches){
                fw.write(coche.getMatricula() + "*" + coche.getMarca() + "*" + coche.getTiempo() + "*" + coche.getPrecio() + "*" + coche.isEstacionado() + "*\n");
            }
            fw.close();
            System.out.println("Se ha escrito correctamente en el fichero");
        } catch(Exception e){
            System.out.println("Error al escribir en el fichero");
        }
    }

    public static void eliminarP(ArrayList<Coche> coches){

        ArrayList<Coche> ch = new ArrayList<>();
        ch.addAll(coches);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche a eliminar: ");
        String matricula = sc.nextLine();
        for (Coche coche : ch){
            if (coche.getMatricula().equals(matricula)){
                coches.remove(coche);
            }
        }
    }

    public static void lista(ArrayList<Coche> l){
        for (Coche coche : l){
            System.out.println("---------------------------------");
            System.out.println(coche.getMatricula() + "---"+ coche.getMarca() + "---" + coche.getTiempo() + "---" + coche.getPrecio() + "---" + coche.isEstacionado());
            //System.out.println("---------------------------------");
        }
    }

    public static void modificarP(ArrayList<Coche> coches){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce parametro a modificar: \n" +
                "1-Matricula\n" +
                "2-Marca\n" +
                "3-Tiempo\n" +
                "4-Estacionado\n");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Introduce la matricula del coche a modificar: ");
                String matricula = sc2.nextLine();
                System.out.println("Introduce la nueva matricula: ");
                String matriculaNueva = sc2.nextLine();
                for (Coche coche : coches){
                    if (coche.getMatricula().equals(matricula)){
                        coche.setMatricula(matriculaNueva);
                    }
                }
                break;
            case 2:
                System.out.println("Introduce la matricula del coche a modificar: ");
                String matricula2 = sc2.nextLine();
                System.out.println("Introduce la nueva marca: ");
                String marcaNueva = sc2.nextLine();
                for (Coche coche : coches){
                    if (coche.getMatricula().equals(matricula2)){
                        coche.setMarca(marcaNueva);
                    }
                }
                break;
            case 3:
                System.out.println("Introduce la matricula del coche a modificar: ");
                String matricula3 = sc2.nextLine();
                System.out.println("Introduce el nuevo tiempo: ");
                double tiempoNuevo = sc.nextDouble();
                for (Coche coche : coches){
                    if (coche.getMatricula().equals(matricula3)){
                        coche.setTiempo(tiempoNuevo);
                        coche.setPrecio(tiempoNuevo * 0.05);
                    }
                }
                break;
            case 4:
                System.out.println("Introduce la matricula del coche a modificar: ");
                String matricula4 = sc2.nextLine();
                System.out.println("Introduce el nuevo estado: ");
                boolean estadoNuevo = sc3.nextBoolean();
                for (Coche coche : coches){
                    if (coche.getMatricula().equals(matricula4)){
                        coche.setEstacionado(estadoNuevo);
                    }
                }
                break;
            default:
                System.out.println("Debes introducir una opcion valida");
                break;
        }
    }

    public static void leerFichero(ArrayList<Coche> coches){

        try(Scanner s = new Scanner(new File("/Users/Rodion/Desktop/Ficherito2.txt")).useDelimiter("\\*")) {
            while (s.hasNext()){
                String matricula = s.next();
                String marca = s.next();
                String tiempo = s.next();
                String precio = s.next();
                String estacionado = s.nextLine();

                coches.add(new Coche(matricula, marca, Double.valueOf(tiempo), Double.valueOf(precio), Boolean.valueOf(estacionado)));
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
