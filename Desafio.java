import java.util.Scanner;
public class Desafio{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        

        /* entrada de dados*/
        float salario, imposto, salario_liq;
        System.out.print("Digite seu salario ");
        salario=teclado.nextFloat();

        imposto = salario * 15/100;
        salario_liq=salario - imposto;

         /* saída*/
         System.out.printf ("Salario Bruto %.2f\n",salario);
         System.out.printf ("valor do imposto %.2f\n", imposto);
         System.out.printf ("Salario Liquido %.2f\n",salario_liq);
    }
}