package Programas;
import java.util.Scanner;

public class Tarea02 {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        float calificacion, suma = 0;
        int contador = 0;
        char opcion;

        do {
            System.out.print("Ingrese la calificación del estudiante (0 a 20): ");
            calificacion = lectura.nextFloat();

            if (calificacion >= 0 && calificacion <= 20) {
                suma += calificacion;
                contador++;
            } else {
                System.out.println("Calificación no válida. Debe estar entre 0 y 20.");
            }

            System.out.print("¿Desea ingresar otra calificación? (s/n): ");
            opcion = lectura.next().charAt(0);

        } while (opcion == 's' || opcion == 'S');

        if (contador > 0) {
            float promedio = suma / contador;
            System.out.println("El promedio de las calificaciones es: " + promedio);
        } else {
            System.out.println("No se ingresaron calificaciones válidas.");
        }
    }
}

