public class array_bidimensional2 {
    public static void main(String args[]) {
        int[][] matrix = {
                {10, 15, 17, 19, 21},
                {5, 41, 43, 53, 12},
                {7, 22, 54, 12, 22},
                {22, 54, 12, 56, 41}
        };
        for (int[]fila:matrix){
            System.out.println();
            for(int z:fila){
                System.out.print(z + " ");
            }
        }
    }
}