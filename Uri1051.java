import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    float salario, pf, sf, tf, imposto1, imposto2, imposto3, impostoTotal;

    pf=0;
    sf=0;
    tf=0;
    imposto1=0;
    imposto2=0;
    imposto3=0;
    impostoTotal=0;

    salario= teclado.nextFloat();

    if (salario <=2000.00)
    System.out.println("Isento");

    else{

    if (salario > 4500)
    imposto1=((salario - 4500) * (28/100));
    pf = (salario - (salario - 4500));

    if (pf > 3000.01 && pf <= 4500)
    imposto2 = ((pf - 3000) * (18/100));
    sf= (pf - (pf-3000));

    if (sf > 2000.01 && sf <= 3000.00)
    imposto3 = ((sf - 2000) * (8/100));

    impostoTotal= (imposto1 + imposto2 + imposto3);

    System.out.printf ("R$ %.2f", impostoTotal);
    }

    
    }
}