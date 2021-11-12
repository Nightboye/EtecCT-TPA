/*

 */
package br.com.programamatriz;

public class ProgramaMatriz {

    public static void main(String[] args) {
        
        System.out.println("Este programa tem o objetivo de mostrar uma matriz e sua soma!\n");
        System.out.println("Tabela da matriz: ");
        
        //matriz
          int [][]matriz = new int[3][3];
    
    matriz[0][0] = 2;
    matriz[0][1] = 4;
    matriz[0][2] = 6;
    
    matriz[1][0] = 8;
    matriz[1][1] = 10;
    matriz[1][2] = 12;
    
    matriz[2][0] = 14;
    matriz[2][1] = 16;
    matriz[2][2] = 18;
    
        //tabela da matriz
        for (int linha=0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
            
            System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println("  ");
        }
        
        //soma
        int soma1=0;
        int soma2=0;
        int soma3=0;
        soma1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        soma2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        soma3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        
        int total = soma1 + soma2 + soma3;
        System.out.println("\nA some é " + total);

    }
    
}
