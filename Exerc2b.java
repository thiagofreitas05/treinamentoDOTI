import java.util.Scanner;
public class Exerc2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float base, altura, area;
        System.out.println("Digite o valor da base: ");
        base = teclado.nextFloat();
        System.out.println("Digite o valor da altura:");
        altura = teclado.nextFloat();
        area = base * altura;
        System.out.println("O valor da area é " + area);
    }
}