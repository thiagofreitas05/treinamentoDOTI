import java.util.Scanner;
public class Exerc2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float diag1, diag2, losango; 
        System.out.println("Digite o valor da Diagonal 1:");
        diag1 = teclado.nextFloat();
        System.out.println("Digite o valor da Diagonal 2:");
        diag2 = teclado.nextFloat();
        losango = diag1*diag2;
        System.out.println("A area total do losango é: " + losango);    }

     
}