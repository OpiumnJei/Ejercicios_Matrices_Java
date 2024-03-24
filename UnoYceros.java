
// Crear una matriiz de 7x7 en donde los elementos de la diagonal principal sean 1 y el resto 0

package matrices;
public class UnoYceros {

    public static void main(String[] args) {
        int[][] m1 = new int[7][7];
 
          for(int i = 0; i<7; i++){
              for(int j = 0;j<7;j++){
              if(i == j){
              m1[i][j] = 1;
              }
              else{
              m1[i][j] = 0;
              }
              }
          }
              
          for(int i = 0; i<7; i++){
            for(int j = 0;j<7;j++){
                System.out.print(m1[i][j]);
              }
              System.out.println(" ");
          }
    }
    
}
