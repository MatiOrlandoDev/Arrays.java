public class bucle_for_each2 {
    public static void main (String args []){
        int[] matriz_aleatorios = new int [150];

        for(int i = 0; i< matriz_aleatorios.length; i ++){
            matriz_aleatorios[i] = (int)Math.round(Math.random()*100); //(int)ya que metodo random da decimal
        }
        for (int numeros:matriz_aleatorios){
            System.out.print(numeros + " ");
        }
    }
}
