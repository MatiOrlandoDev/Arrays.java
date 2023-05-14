import java.util.Scanner;

public class uso_arrays9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int arreglo[] = new int [10];
        int conteo_pares=0, conteo_inpares=0;

        System.out.println("Llenar el arreglo: ");
        for(int i = 0; i<10; i++){
            System.out.println((i+1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();

            if(arreglo[i] % 2==0){
                conteo_pares++; //si el numero es par
            } else{             // si es inpar
                conteo_inpares++;
            }
        }
        //crear los arreglos siguientes
        int par[]=new int[conteo_pares];
        int inpar[] = new int [conteo_inpares];

        conteo_pares=0;         // los utilizamos como iteradores
        conteo_inpares=0;
        //almacenamos pares e inpares en su arreglo
        for(int i =0; i<10;i++){
            if(arreglo[i] % 2 ==0){ // si el numero es par
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            } else {
                inpar[conteo_inpares] = arreglo[i];
                conteo_inpares++;
            }
        }
        System.out.println("Arreglo pares: ");
        for (int i=0;i<conteo_pares; i++){
            System.out.println(par[i] + "-");
        }
        System.out.println("");
        System.out.println("Arreglo inpares: ");
        for (int i=0;i<conteo_inpares; i++) {
            System.out.println(inpar[i] + "-");
        }
        System.out.println("");
    }
}
