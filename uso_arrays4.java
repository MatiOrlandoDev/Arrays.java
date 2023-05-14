import java.util.Scanner;

public class uso_arrays4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros [] = new float[5];
        float suma_positivos = 0, suma_negativos = 0, media_positivos, media_negativos;
        int conteo_Positivos = 0, conteo_negativo =0, conteo_ceros=0;

        System.out.println("Guardando los numeros en el arreglo");
        for(int i = 0; i<5;i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();

            if(numeros[i] == 0){
                conteo_ceros++;
            } else if (numeros[i]>0){
                suma_positivos+=numeros[i];
                conteo_Positivos++;
            } else {
                suma_negativos += numeros[i];
                conteo_negativo++;
            }
        }
        //media de los numeros positivos
        if(conteo_Positivos==0){
            System.out.println("No se puede sacar la media de los numeros positivos");
        } else{
            media_positivos = suma_positivos / conteo_Positivos;
            System.out.println("La media de los mumeros positivos es: " + media_positivos);
        }
        //media de los numeros negativos
        if(conteo_negativo==0){
            System.out.println("No es posible sacar la media de los numeros negativos");
        } else{
            media_negativos = suma_negativos / conteo_negativo;
            System.out.println("La media de los numeros negativos es: " + media_negativos);
        }
        System.out.println("La cantidad de ceros es: " + conteo_ceros);
    }
}

