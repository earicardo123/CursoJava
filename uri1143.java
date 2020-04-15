import java.util.Scanner;
public class uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int a=0, b=0, c=0;
        for (int i=1; i<=N; i++){
            a=i;
            b=i*i;
            c=i*i*i;

            System.out.print(a+" "+b+" "+c+"\n");
            }
        }
    }

/*
import java.util.Scanner;
public class uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i=1; i<=N*4; i++){
            if (i % 4 == 0){
                System.out.println("PUM");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
} */