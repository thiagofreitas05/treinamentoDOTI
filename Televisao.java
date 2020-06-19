// novo tipo de dado
public class Televisao{
    String  marca;
    int     tamanhoTela;
    int     canal;
    int     volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }

    void avancarCanal(){
        if (ligada == true && canal>=1; canal<=100){
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            if(ligada == true & canal < 1){
                System.out.println("Canal mínimo é 1");
            } else {
                if(ligada == true && canal > 100){
                    System.out.println("Canal Maximo é 99");
                } else {
                    if (ligada == false){
                        System.out.println("Por favor, antes ligue a TV "+marca);

                }
            
            
        }
    }

    void volume(){
        if(ligada == true && volume >1 && volume <= 99){
            System.out.println("Volume "+volume);
        } else {
            if (ligada == true && volume > 99){
                System.out.println("Volume máximo 99");
            } else {
                if(ligada == true && volume < 1){
                    System.out.println("Volume minimo 1");
                } else {
                    if (ligada == false){
                        System.out.println("Por favor, antes ligue a TV "+marca);

                }
            }
        }

            
        }
    }




}