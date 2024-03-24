/*
crear dos matrices 3x3, sumarlas y mostrar su suma. 
 */
package matrices;

import java.util.Scanner;

public class SumaDMatrices {
    //Jerlinson Gonzalez
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
       int[][] m1 = new int[3][3];
       int[][] m2 = new int[3][3];
        int[][] suma = new int[3][3];
        
     //Llenamos las matrices 
       
       System.out.println("RELLENE LA 1era MATRIZ. ");
       for(int i = 0; i<m1.length;i++){
           for(int j= 0; j<m1.length;j++){
               System.out.print("Digite la matriz "+"["+i+"]"+"["+j+"]: ");
               m1[i][j] = sc.nextInt();
           
           }
           
       }
            
        System.out.println("RELLENE LA 2da MATRIZ. ");
        
       for(int i = 0; i<m2.length;i++){
           for(int j= 0; j<m2.length;j++){
               System.out.print("Digite la matriz "+"["+i+"]"+"["+j+"]: ");
               m2[i][j] = sc.nextInt();
           }
       }
       
       //SUMAR LAS  MATRICES 
       
       for(int i = 0; i<suma.length;i++){
           for(int j= 0; j<suma.length;j++){
               suma[i][j] = m1[i][j] - m2[i][j]; 
           }
       }
       
       //imprimir 
        for(int i = 0; i<suma.length;i++){
           for(int j= 0; j<suma.length;j++){
               System.out.print(suma[i][j]+" ");
       } 
            System.out.println(" ");
      }
  
        
        
    }
}


       
    
    

