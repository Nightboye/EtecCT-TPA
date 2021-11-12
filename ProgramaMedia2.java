/*

 */
package br.com.programamedia2;

import java.util.Scanner;

public class ProgramaMedia2 {

    public static void main(String[] args) {
        
        Scanner nota = new Scanner(System.in);
        String numero2;
        int i, numero;

        double n = 0;
        double n2 = 0;
        double[] media = new double[10];

        for (int cont = 1; cont <= 2; cont++) {

            System.out.println("Digite a primeira nota da " + cont + "ª pessoa");
                n = nota.nextInt();
            System.out.println("Digite a segunda nota da " + cont + "ª pessoa");
                n2 = nota.nextInt();
           System.out.printf("\n\nA média da "+cont+"ª pessoa é " + media[x]);
        }
        
        
      }

    }
