import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroEmpleados {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el ID del empleado: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el apellido del empleado: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese el departamento del empleado: ");
            String departamento = scanner.nextLine();

            System.out.print("Ingrese el salario del empleado: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(empleado);

            System.out.print("¿Desea agregar otro empleado? (S/N): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // Mostrar empleados registrados usando Iterator
        System.out.println("Empleados registrados:");
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println(empleado);
        }

        scanner.close();
    }
}
