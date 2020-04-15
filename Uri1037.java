import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    float n1;
    n1= teclado.nextFloat();

    if (n1 >= 0 && n1 <=25)
        System.out.println ("Intervalo [0,25]");   

    else if (n1>25 && n1<=50)
        System.out.println ("Intervalo (25,50]");

    else if (n1>50 && n1<=75)
        System.out.println ("Intervalo (50,75]");

    else if (n1>75 && n1<=100)
        System.out.println ("Intervalo (75,100]");

    else
        System.out.println ("Fora de intervalo");  
    }
}