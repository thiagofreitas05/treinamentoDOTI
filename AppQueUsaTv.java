public class AppQueUsaTv{
    public static void main(String args[]){
        Televisao t;          // declaro a TV
        t = new Televisao();  // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = false;
        t.canal = 5;
        t.volume = 100;

        Televisao x = new Televisao();
        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = false;
        x.canal = 9;
        x.volume = 5;

        t.power();
        x.power();
        t.volume();
        x.volume();


    }
}
