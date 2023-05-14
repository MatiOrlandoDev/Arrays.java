import java.util.Scanner;

public class uso_arrays5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[20]; // contendra arreglo a y b

        //pedimos el arrelgo a
        System.out.println("Digite el primer arreglo ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        //pedimos el arreglo b
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        //Ahora vamos a mezclar los 2 arreglos en el arreglo c
        // vamos a utilizar el iterador i para a y b y el iterador j para el arreglo c
        int j=0;
        for(int i =0; i<10; i++){
            c[j] = a[i]; //1.A, 2.A
            j++;
            c[j] = b[i]; //1.B, 2.B
            j++;
        }
        System.out.println("El tercer arreglo es: ");
        for(int i =0; i<20; i++){
            System.out.print(c[i]+" ");

        }
        System.out.println();
    }
}