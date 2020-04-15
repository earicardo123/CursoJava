import java.util.Scanner;

public class uri1034{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao, alc=0, gas=0, die=0;
/*
        System.out.println("1.Alcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim"); */
    
    do{
                
        opcao= teclado.nextInt();

        if (opcao==1)
            alc++;
        else if (opcao==2)
            gas++;
        else if (opcao==3)
            die++;
        else if (opcao==4)
            continue;
        
                
        
             

    } while (opcao!=4);
    
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+alc);
    System.out.println("Gasolina: "+gas);
    System.out.println("Diesel: "+die);
    }
}