import java.util.Scanner;
public class Uri1040{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
    float n1,n2,n3,n4,media, exame;
    
    n1 = teclado.nextFloat();
    n2 = teclado.nextFloat();
    n3 = teclado.nextFloat();
    n4 = teclado.nextFloat();
    
    media =(n1*2+n2*3+n3*4+n4*1)/10;

    if (media >= 7f){
        System.out.printf("Media: %.1f\n", media);
        System.out.println("Aluno aprovado");
    } else {
        if ( media < 5f){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado");
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame");
            exame = teclado.nextFloat();
            media = (exame + media)/2;
            if (media>= 5f){
                System.out.println("Aluno aprovado\n");
                System.out.printf("Media Final: %.1f\n", media);
            }

        }
    }
    
    

    

   
        
    }
}