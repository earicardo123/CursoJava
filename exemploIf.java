import java.util.Scanner;

public class exemploIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float nota1, nota2, med;

        System.out.print("Digite a primeira nota ");
        nota1= teclado.nextFloat();

        System.out.print("Digite a segunda nota ");
        nota2= teclado.nextFloat();

        med=(nota1 + nota2) / 2;

        

        if (med>=6.0f)
        System.out.println ("APROVADO");

        System.out.println ("Sua media = "+med);

        
    }
}
