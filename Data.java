import java.util.Scanner;
public class Data{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int data, ano, mes, dia, resto;
        System.out.print ("Digite uma data no formato DDMMAAAA ");
        data=teclado.nextInt();


/*  22032020 / 1000


*/
        ano =data % 10000;
        resto= data / 10000;
        mes=  resto % 100;
        dia=resto / 100;
        

        System.out.println("Ano = "+ano);
        System.out.println("Mes = "+mes);
        System.out.println("Dia = "+dia);
        
    }
}
