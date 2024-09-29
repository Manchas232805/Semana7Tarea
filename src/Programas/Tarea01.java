package Programas;
import java.util.Scanner;

/*
Este programa presenta un menú interactivo donde el usuario puede elegir entre diferentes operaciones matemáticas
(suma, resta, multiplicación, división) o salir del programa. El ciclo continúa hasta que el usuario elige salir.
 */
public class Tarea01 {
    public static void main(String[] args) {
        int a, b, op;
        boolean dif = true;
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.println("\n--- Menú de operaciones Matemáticas ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Cerrar");
            System.out.println("--------------------------------------");

            System.out.print("Elige una opción: ");
            op = lectura.nextInt();

            if (op >= 1 && op <= 4) {
                System.out.print("Introduce el primer número: ");
                a = lectura.nextInt();
                System.out.print("Introduce el segundo número: ");
                b = lectura.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Resultado de la suma: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Resultado de la división: " + (a / b));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                }
            } else if (op == 5) {
                dif = false;
            } else {
                System.out.println("No es una opción válida, intente de nuevo.");
            }
        } while (dif);

        System.out.println("Gracias por usar el programa.");
    }
}