import java.util.Scanner;

public class uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha=0;

        while (senha!=2002){
            senha = teclado.nextInt();
            if (senha==2002){
                continue;
            }
            System.out.println("Senha Invalida");
            
        }
        System.out.println("Acesso Permitido");
    }
}