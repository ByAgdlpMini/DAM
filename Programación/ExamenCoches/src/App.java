import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int id = 0;
        String modelo;
        String marca;
        String dueño;
        String estado = "Pendiente";
        taller tallerdeAdri = new taller("Taller de Adri", "Calle Pasteleria");

        while (op != 5) {
            System.out.println();
            System.out.println();
            System.out.println("1. Insertar un Nuevo VideoJuego");
            System.out.println("2. Quitar un Videojuego de la Lista");
            System.out.println("3. Modificar precio de un videojuego");
            System.out.println("4. Mostrar la lista de Videojuegos disponibles en la Tienda");
            System.out.println("5: Salir");

            op = sc.nextInt();
            sc.nextLine();
            if (op == 1) {
                for (coche coches : tallerdeAdri.getListaCoches()) {
                    System.out.println(coches.toString());
                }
            }
            if (op == 2) {
                System.out.println("Marca: ");
                modelo = sc.nextLine();
                System.out.println("Modelo: ");
                marca = sc.nextLine();
                System.out.println("Dueño: ");
                dueño = sc.nextLine();
                coche newcoche = new coche(marca, modelo, dueño, estado, id);
                tallerdeAdri.añadirCoche(newcoche);
                id++;
            }
            if (op == 3) {
                List<coche> coches = tallerdeAdri.getListaCoches();
                for (int i = 0; i < coches.size(); i++) {
                    System.out.println("Posición: " + i + ":" + " Datos de " + coches.get(i).toString());
                }
                System.out.println("Dame el Posición del coche a eliminar: ");
                int aeliminar = sc.nextInt();
                tallerdeAdri.eliminarCoche(aeliminar);
            }
            if (op == 4) {
                List<coche> coches = tallerdeAdri.getListaCoches();
                for (int i = 0; i < coches.size(); i++) {
                    System.out.println("Posición: " + i + ": " + "Datos de " + coches.get(i).toString());
                }
                System.out.println("Dame la posición del coche para cambiar su estado: ");
                int pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos < coches.size()) {
                    System.out.println("Selecciona un nuevo estado: ");
                    System.out.println("1. Pendiente");
                    System.out.println("2. En proceso");
                    System.out.println("3. Arreglado");
                    int opcion = sc.nextInt();
                    sc.nextLine();
                    switch (opcion) {
                        case 1:
                            estado = "Pendiente";
                            break;
                        case 2:
                            estado = "En proceso";
                            break;
                        case 3:
                            estado = "Arreglado";
                            break;
                        default:
                            System.out.println("Opción inválida, se mantendrá el estado actual.");
                            continue;
                    }
                    coche c = coches.get(pos);
                    c.setEstado(estado);
                    System.out.println("Estado del coche en la posición " + pos + " cambiado a: " + estado);
                } else {
                    System.out.println("La posición especificada no es válida.");
                }
            }
        }
        System.out.println("Gracias.");
        sc.close();
    }
}
