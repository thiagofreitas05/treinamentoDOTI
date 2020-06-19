import java.util.Scanner;
public class Exerc4{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario,valorhr,qtdhr,inss,salLiq,perc,total;
        System.out.println("Digite o valor da hora:");
        salario = teclado.nextFloat();
        System.out.println("Digite a quantidade de horas:");
        qtdhr = teclado.nextFloat();
        System.out.println("Digite o valor percentual de desconto do INSS:");
        inss = teclado.nextFloat();

        perc = inss/100f;
        salLiq = (qtdhr*salario)*perc; 
        total = (qtdhr*salario)-salLiq;
        System.out.printf("O salário liquido é %.2f\n", total);
    }
}
