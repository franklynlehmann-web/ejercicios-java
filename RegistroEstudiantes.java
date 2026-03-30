import java.util.HashMap;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {
        HashMap<String, Double> estudiantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    estudiantes.put(nombre, nota);
                    break;

                case 2:
                    for (String key : estudiantes.keySet()) {
                        System.out.println(key + ": " + estudiantes.get(key));
                    }
                    break;

                case 3:
                    System.out.print("Buscar nombre: ");
                    String buscar = sc.nextLine();
                    if (estudiantes.containsKey(buscar)) {
                        System.out.println("Nota: " + estudiantes.get(buscar));
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;

                case 4:
                    System.out.print("Eliminar nombre: ");
                    String eliminar = sc.nextLine();
                    estudiantes.remove(eliminar);
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}