import java.util.Scanner;
public class Exerc3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario, qtdKw, total, totalDesc, kw;
        float desc = 0.10f;
        System.out.println("Digite o valor do salario minimo:");
        salario = teclado.nextFloat();
        System.out.println("Digite a quantidade de KW/h:");
        qtdKw = teclado.nextFloat();
        kw = (salario/7)/100;
        total = qtdKw * kw;
        totalDesc = total * desc;
        System.out.printf("O valor do Kw/h é %f.2\n",kw);
        System.out.printf("O total à ser pago é %f.2\n",total);
        System.out.printf("O total com desconto é %f.2\n",totalDesc);
    }
}