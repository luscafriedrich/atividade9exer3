/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade9exer3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Atividade9exer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       int cobaia, cont, numCobaias, aRatos, aCoelhos;
       double porcentagemRatos, porcentagemCoelhos, total;
       aRatos = 0; aCoelhos = 0; cont = 0; numCobaias = 0;
       
       while(cont < 3){
           System.out.println("Digite\n 1 para Ratos:\n 2 para Coelhos:");
           cobaia = teclado.nextInt();
           System.out.println("Informe a quantidade de cobaias utilizada:");
           numCobaias = teclado.nextInt();
           if(cobaia == 1){
               aRatos = aRatos + numCobaias;
               cont++;
           }else if(cobaia == 2){
               aCoelhos = aCoelhos + numCobaias;
               cont++;
           }else{
               System.out.println("Digite um número válido!!");
           }
       }//fim do loop
       total = aRatos + aCoelhos;
       porcentagemRatos = aRatos * 100 / total;
       porcentagemCoelhos = aCoelhos * 100 / total;
        System.out.println("A quantidade total de cobaias utilizadas é de: "+total+" cobaias.");
        System.out.println("A quantidade de ratos utilizada foi de: "+aRatos+" ratos.");
        System.out.println("A quantidade de coelhos utilizada foi de: "+aCoelhos+" coelhos.");
        System.out.println("O percentual de ratos utilizada foi de: "+porcentagemRatos+"%");
        System.out.println("O percentual de coelhos utilizada foi de: "+porcentagemCoelhos+"%");
    }   
}
