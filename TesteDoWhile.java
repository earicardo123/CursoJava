import java.util.Scanner;

public class TesteDoWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao;
    
    do{
        System.out.println("I nao ta U - seu Banco\n");
        System.out.println("1 para saque");
        System.out.println("2 para deposito");
        System.out.println("3 para transferencia");
        System.out.println("0 para encerrar");
        System.out.println("--------- Digite sua opcao: ");
        opcao= teclado.nextInt();

        System.out.println("Opcao escolhida = "+opcao);


    } while (opcao!=0);
    
    System.out.println("Fim do Programa");
    }
}