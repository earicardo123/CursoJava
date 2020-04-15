import java.util.Scanner;
public class uri1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valor, soma=0;

        
        valor= teclado.nextInt();
            
            for (int den=1; den<=valor; den++){
                  if (valor%den==0)
                  soma= soma+den;
            }
            
            if (soma==valor)
            System.out.println(valor +" eh perfeito");

            else
            System.out.println(valor +" nao eh perfeito");
                          
            
        }
    }