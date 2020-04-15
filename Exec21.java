import java.util.Scanner;

public class Exec21{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    float altura, peso;
    int sexo;

    System.out.print("Digite seu sexo: 1 para masculino e 2 para feminino ");
    sexo =teclado.nextInt();

    System.out.print("Digite sua altura ");
    altura=teclado.nextFloat();

    if(sexo==1){
        peso=(72.7f*altura)-58f;
        System.out.println ("Seu peso ideal é = "+peso);

    }
    else{
        peso=(62.1f*altura)-44.7f;
        System.out.println ("Seu peso ideal e = "+peso);
    }

    System.out.println ("Seu peso ideal é = "+peso);
    }
}