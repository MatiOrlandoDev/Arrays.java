import java.util.*;

public class uso_arrays10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arreglo[], numero;
        boolean creciente =true;

        arreglo = new int [10];

        do{
            //Pedimos el arreglo
            System.out.println("Rellene el arreglo");
            for (int i =0; i<10; i ++){
                System.out.println(i+". Digite un numero");
                arreglo[i]=entrada.nextInt();
            }
            //verificar si el arreglo esta ordenado
            for(int i = 0; i<9; i++){
                if(arreglo[i] < arreglo[i+1]){
                    creciente=true;
                }
                if (arreglo[i] > arreglo[i+1]){
                    creciente =false;
                    break;
                }

            }
            if(creciente==false){
                System.out.println("El arreglo esta desordenado, digite nuevamente ");
            }
        }while(creciente==false);
        //Pedimos el numero a buscar
        System.out.println("Digite el numero a buscar en el arreglo");
        numero = entrada.nextInt();

        //Buscamos el numero en el arreglo
        int i =0;
        while(i<10 && arreglo[i]<numero){
            i++;
        }
        if(i==10){
            System.out.println("Numero no encontrado");
        } else {
            if(arreglo[i]==numero){
                System.out.println("Numero encontrado en la posicion: " + i);
            } else {
                System.out.println("Numero no encontrado");
            }
        }
    }
}
