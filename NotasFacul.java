import java.util.Scanner;

public class NotasFacul{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float n1,n2, med;

        n1= teclado.nextFloat();
        n2= teclado.nextFloat();

        med = (n1+n2)/2;

        if(med>=9){
            System.out.println ("Conceito A");
                }
            else if (med>=8){
                System.out.println ("Conceito B");   
                }
                    else if (med>=7){
                    System.out.println ("Conceito C");  
                    }
                        else if (med>=6){
                        System.out.println ("Conceito D"); 
                        }
                            else if(med>=5){
                            System.out.println ("Conceito E");
                            }
                                else {
                                System.out.println ("Conceito F");   
                                }

        System.out.println ("Sua media = "+med);
    }
}