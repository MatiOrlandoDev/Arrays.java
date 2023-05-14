
public class array_bidimensional {       // array dentro de un array
    public static void main (String args []){

        int [][] matrix = new int [4][5];

        matrix[0][0] =23 ;
        matrix[0][1] =44 ;
        matrix[0][2] =22 ;
        matrix[0][3] =32 ;
        matrix[0][4] =44 ;

        matrix[1][0] =53 ;
        matrix[1][1] =64 ;
        matrix[1][2] =23 ;
        matrix[1][3] =11 ;
        matrix[1][4] =23 ;

        matrix[2][0] =41 ;
        matrix[2][1] =33 ;
        matrix[2][2] =44 ;
        matrix[2][3] =25 ;
        matrix[2][4] =23 ;

        matrix[3][0] =23 ;
        matrix[3][1] =11 ;
        matrix[3][2] =11 ;
        matrix[3][3] =35 ;
        matrix[3][4] =23 ;

        for (int i = 0; i<4; i++){          // recorre la primera dimension de 0 a 3
            System.out.println();
            for (int j = 0; j<5; j++){      // recorre la segunda dimension
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
