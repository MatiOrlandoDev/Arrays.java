import java.util.Scanner;

public class uso_arrays3 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];

        System.out.println("Guardando los datos en el arreglo");
        for (int i = 0;i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("Imprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }
    }
}
