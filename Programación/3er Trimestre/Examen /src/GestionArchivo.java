import java.io.*;
import java.util.Scanner;

public class GestionArchivo {

    public static void main(String[] args) {
        String nombreArchivo = "coches.txt";
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Modificar una línea del archivo");
            System.out.println("2. Añadir una línea al archivo");
            System.out.println("3. Eliminar una línea del archivo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    modificarLinea(nombreArchivo);
                    break;
                case 2:
                    agregarLinea(nombreArchivo);
                    break;
                case 3:
                    eliminarLinea(nombreArchivo);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
    }

    // Método para modificar una línea del archivo
    public static void modificarLinea(String nombreArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            StringBuilder contenido = new StringBuilder();
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese el número de línea que desea modificar: ");
                int numeroLinea = scanner.nextInt();
                
                String linea;
                int contador = 1;

                while ((linea = reader.readLine()) != null) {
                    if (contador == numeroLinea) {
                        System.out.print("Ingrese la nueva línea: ");
                        String nuevaLinea = scanner.nextLine();
                        contenido.append(nuevaLinea);
                    } else {
                        contenido.append(linea);
                    }
                    contenido.append(System.lineSeparator());
                    contador++;
                }
            }
            
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write(contenido.toString());
            writer.close();
            System.out.println("Línea modificada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para agregar una línea al archivo
    public static void agregarLinea(String nombreArchivo) {
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true));
                
                System.out.print("Ingrese la nueva línea que desea agregar: ");
                String nuevaLinea = scanner.nextLine();
                
                writer.write(nuevaLinea);
                writer.newLine();
                writer.close();
            }
            System.out.println("Línea agregada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para eliminar una línea del archivo
    public static void eliminarLinea(String nombreArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            StringBuilder contenido = new StringBuilder();
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese el número de línea que desea eliminar: ");
                int numeroLinea = scanner.nextInt();
                
                String linea;
                int contador = 1;

                while ((linea = reader.readLine()) != null) {
                    if (contador != numeroLinea) {
                        contenido.append(linea);
                        contenido.append(System.lineSeparator());
                    }
                    contador++;
                }
            }
            
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            writer.write(contenido.toString());
            writer.close();
            System.out.println("Línea eliminada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

