import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor, total;
        int cod, quant;

        cod= teclado.nextInt();
        quant=teclado.nextInt();

        valor=0;

        if (cod==1)
        valor=4;
        else if (cod==2)
        valor=4.5f;
        else if (cod==3)
        valor=5;
        else if (cod==4)
        valor=2;
        else if (cod==5)
        valor=1.5f;
    
    total =(valor * quant);
    System.out.printf ("Total: R$ %.2f", total);
        }
}        
  