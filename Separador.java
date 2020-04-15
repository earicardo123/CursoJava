import java.util.Scanner;
public class Separador{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int numero, unid, dez, cent, resto;
        System.out.print ("Digite um numero de tres digitos ");
        numero=teclado.nextInt();

        cent=numero/100;
        resto=numero % 100;

        dez = resto / 10;
        unid= resto % 10;
        
        
        System.out.println("Centenas = "+cent);
        System.out.println("Dezenas = "+dez);
        System.out.println("Unidades = "+unid);
        System.out.println("resto = "+resto);



    }
}