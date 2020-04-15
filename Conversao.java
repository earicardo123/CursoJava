import java.util.Scanner;
public class Conversao{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int valorConvertido;
        String texto;

        System.out.println("Digite qualquer coisa");
        texto=teclado.nextLine();

        valorConvertido=Integer.parseInt(texto);

        System.out.println("Você digitou = "+texto);
        System.out.println("Eu modifiquei = "+(valorConvertido));
    }
}