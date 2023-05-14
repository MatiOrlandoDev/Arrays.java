import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class uso_arrays6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // creamos el arreglo de 10 elementos del arreglo
        boolean creciente = false, decreciente = false;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un numero");
            arreglo[i] = entrada.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                creciente = true;
            }
            if (arreglo[i] > arreglo[i + 1]) {
                creciente = true;
            }
        }
        if (creciente == true && decreciente == false) {
            System.out.println("El arreglo esta en forma creciente");
        } else if (creciente == true && decreciente == true) {
            System.out.println("El arreglo esta en forma decreciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("El arreglo esta desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("Todos los numeros son iguales");

        }
    }
}