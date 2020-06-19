import java.util.Scanner;
public class Exerc5 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float tempo,velocidade,distancia,litros;
        System.out.println("Digite o tempo gasto:");
        tempo = teclado.nextFloat();
        System.out.println("Digite a velocidade media:");
        velocidade = teclado.nextFloat();
        distancia = velocidade * tempo;
        litros = distancia/12f;
        System.out.printf("O total de litros gastos foram %.3f\n", litros);
    }
}