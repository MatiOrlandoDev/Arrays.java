import java.util.Scanner;

public class uso_arrays7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int [10]; // Creamos el arreglo de 10 elementos enteros
        int ultimo;

        System.out.println("Llenar el arreglo");
        for(int i =0; i<10; i++){
            System.out.print(i+ ".Digite un numero");
            arreglo[i] = entrada.nextInt();
        }
        ultimo=arreglo[9];
        for(int i = 8; i>0;i--){        // avanzar una posicion abajo en el arreglo
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo; //Ponemos el ultimo elemento como primero
        System.out.println("El nuevo arreglo es: ");
        for(int i = 0; i<10; i++){
            System.out.println(i + "Numero: " + arreglo[i]);
        }
    }
}
