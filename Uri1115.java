import java.util.Scanner;
public class Uri1115{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    float x,y;

    do{
    x=teclado.nextFloat();
    y=teclado.nextFloat();

    if(x > 0f && y > 0f){
        System.out.println("primeiro");
        break;
    } else {
        if(x < 0f && y > 0f){
            System.out.println("segundo");
            
        } else{
            if(x<0f && y<0f){
                System.out.println("terceiro");  
                   
            } else{
                if(x>0f && y<0){
                System.out.println("quarto");
            
            }
        }
    }
}
}

while(x==0 && y==0);

}
}




