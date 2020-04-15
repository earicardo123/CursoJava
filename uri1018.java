import java.util.Scanner;
public class uri1018{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int numero, nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto, resto2, resto3,resto4, resto5, resto6;
        
        numero=teclado.nextInt();

        nota100 = numero/100;
        resto =  numero%100;
        nota50 = resto/50;
        resto2= resto%50;
        nota20 = (resto2)/20;
        resto3= resto2%20;
        nota10= (resto3)/10;
        resto4=resto3%10;
        nota5=(resto3)/5;
        resto5=resto4%5;
        nota2=(resto5)/2;
        resto6=resto5%2;
        nota1= (resto6);


        System.out.println(numero);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
}