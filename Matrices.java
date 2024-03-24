/*
 Una matriz es un arreglo bidimensional, es decir, de dos dimensiones. 
Una matriz esta  conformada por filas y columnas.

sintaxis para definir una matriz: 
F: filas
C: Columnas
                                F  C
int[][] matrizEnteros = new int[3][3];
 */


package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ///Declaramos la matriz
        
        int[][] Matriz = new int[3][3];
        
        //Rellenar la matriz es muy similar a llenar un array, la unica diferencia es que necesitamos usar dos itaradores, 
        //Uno para las filas y otro para las columnas 
        
        for(int f = 0; f<Matriz.length; f++){  //para las filas
           for(int c = 0; c<Matriz.length; c++){//para las columnas
               System.out.print("Rellene la matriz: ");
               Matriz[f][c] = sc.nextInt();
           
           }
        }
        
        
        //Imprimos la matriz 
        
        System.out.println("La matriz introducida fue: ");
        
        for(int f = 0; f<Matriz.length; f++){ 
           for(int c = 0; c<Matriz.length; c++){
               System.out.print(Matriz[f][c]);
           
           }
           
            System.out.println(" ");
        }
                
                
    }
    
}
