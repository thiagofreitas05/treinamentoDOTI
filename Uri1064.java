import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num;
        float qtd=0;
        float soma=0;
        float media=0;

        for(int cont=1; cont <=6; cont++){
            num=teclado.nextFloat();
            if(num>=0){
                qtd = qtd+1;
                soma = soma + qtd;
            }
           
    }
    media = soma/qtd;
    System.out.println(qtd + " valores positivos");  
    System.out.println(media);  

}
}