import java.util.Scanner;

public class TesteWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor=1;

        while (valor<=10000){
            System.out.println("Valor da variavel= "+valor);
            valor++;
        }
        System.out.println("Fim do programa");
    }
}
