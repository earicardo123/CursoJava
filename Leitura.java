/*
este programa é um exemplo de como se fazer uma leitura de dados 
vinda do teclado, um pequeno cálculo e exibir o valor na tela
*/

/* para fazer a leitura vou precisar de uma biblioteca */

import java.util.Scanner;
public class Leitura{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        

        /* entrada de dados*/
        int valor;
        System.out.print("Digite um valor ");
        valor=teclado.nextInt();

        /* processamento*/
        valor=valor*100;

        /* saída*/
        System.out.print ("Novo valor "+valor);


        


    }
    
}