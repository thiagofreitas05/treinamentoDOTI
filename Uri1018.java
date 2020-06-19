import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite o valor:");
        int valor = teclado.nextInt();
        int c100,c50,c20,c10,c5,c2,c1;
        int resto;

        c100 = valor/100;
        resto = valor%100;
        c50 = resto/50;
        resto = resto%50;
        c20 = resto/20;
        resto = resto%20;
        c10 = resto/10;
        resto = resto%10;
        c5 = resto/5;
        resto = resto%5;
        c2 = resto/2;
        resto = resto%2;
        c1 = resto/1;
        resto = resto%1;

        System.out.println(valor);
        System.out.println(c100 + " nota(s) de R$ 100,00");
        System.out.println(c50 + " nota(s) de R$ 50,00");
        System.out.println(c20 + " nota(s) de R$ 20,00");
        System.out.println(c10 + " nota(s) de R$ 10,00");
        System.out.println(c5 + " nota(s) de R$ 5,00");
        System.out.println(c2 + " nota(s) de R$ 2,00");
        System.out.println(c1 + " nota(s) de R$ 1,00");
    }
}