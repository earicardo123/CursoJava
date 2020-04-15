import java.util.Scanner;
public class uri1017{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int tempo, veloc;
        float gasto;

        tempo=teclado.nextInt();
        veloc=teclado.nextInt();

        gasto = (tempo * veloc) / 12f;

        System.out.printf("%.3f\n", gasto);
    }
}

