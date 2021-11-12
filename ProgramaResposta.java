/*
    Feito por Daniel Alves dos Santos
    Etec Cidade Tiradentes
    1ºano INFO
 */
package programaresposta;

import java.util.Scanner;

public class ProgramaResposta {

    public static void main(String[] args) {
        
        Scanner usbdados = new Scanner (System.in);
        
        
        String opcao;
        boolean loop = true;
        
        while(loop){
            System.out.println("\n\nVocê está em um loop");
            System.out.print("Se deseja sair do loop?\n");
            System.out.print("Responda com 'sim': ");
            opcao = usbdados.next();
           
            switch (opcao) {
                case "sim":
                loop=false;
                System.out.println("\nVocê saiu do Loop.");
                break;
                
                default:
               System.out.println("Retomando...");
            }//fim do switch
            }//fim do while
        }//fim do void
    }
