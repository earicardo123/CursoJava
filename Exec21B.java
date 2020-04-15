import java.util.Scanner;

public class Exec21B{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade;
        

        System.out.println("Digite sua idade ");
        idade = teclado.nextInt();

        if(idade < 16){
            System.out.println ("Não eleitor");
        }

        else if (idade>=18 && idade <65){
            System.out.println ("Obrigatorio");
        }

        else {
            System.out.println ("Facultativo");

        }


    }
}