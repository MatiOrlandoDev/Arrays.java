import java.util.Scanner;

public class uso_arrays8 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int arreglo[] =  new int[10];
        boolean creciente = true;
        int numero, sitio_num=0, j =0;
        System.out.println("Llenar el arreglo");
        do{
            //llenando el arreglo
            for (int i =0; i<5;i++){
                System.out.println((i+1)+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            // comprobar si el arreglo esta ordenado en orden creciente
            for(int i = 0; i<4; i++){
                if(arreglo[i] < arreglo[i+1]){  //creciente
                    creciente = true;
                } if (arreglo[i] > arreglo[i+1]){   //decreciente
                    creciente = false;
                break;
                }
            }
            if (creciente == false){
                System.out.println("El arreglo no esta ordenando en forma creciente, vuelva a digitar");
            }

        } while(creciente==false);

        System.out.println("Digite un elemento a insertar ");
        numero = entrada.nextInt();

        while(arreglo[j]<numero && j<5){
            // Esto es para darnos cuenta en que posicion va a ir el numero
            sitio_num++;
            j++;
        }
        //Transladamos una posicion en el arreglo que va detras del numero
    for(int i=4;i>=sitio_num;i--){
        arreglo[i+1]=arreglo[i];
        }
    //Insertamos el numero que el usuario puso
        arreglo[sitio_num] = numero;
        System.out.println("El arreglo queda");
        for(int i =0; i<6;i++){
            System.out.println(arreglo[i]+"-");
        }
        System.out.println();
    }
}
