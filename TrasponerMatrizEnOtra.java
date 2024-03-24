/*
Utilizando dos matrices de una de 2x3 y  una de 3x2, llenar la primera matriz y trasponerla en la segunda. 
 */
package matrices;

import java.util.Scanner;

public class TrasponerMatrizEnOtra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] m1 = new int[2][3];
        int[][] m2 = new int[3][2];
        
        System.out.println("Digite una matriz");
        
        for(int f = 0; f<2;f++){
            for(int c = 0; c<3;c++){
                System.out.print("Matriz ["+f+"]["+c+"]: ");
                m1[f][c] = sc.nextInt();
            }
        }
        
        //Imprimimos la matriz original
        for(int f = 0; f<2;f++){
            for(int c = 0; c<3;c++){
                System.out.print(m1[f][c]);
            }
            System.out.println(" ");
        }
        
        //Trasponemos la matriz
        
         for(int f = 0; f<3;f++){
            for(int c = 0; c<2;c++){
                m2[f][c] = m1[c][f];
            }
            System.out.println(" ");
        }
        
            //Imprimimos la matriz transpuesta
        for(int f = 0; f<3;f++){
            for(int c = 0; c<2;c++){
                System.out.print(m2[f][c]);
            }
            System.out.println(" ");
        }
        
        
        
      
    }
    
}
