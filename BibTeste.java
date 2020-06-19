public class BibTeste{
public static void main(String args[]){
    Biblioteca livro1,livro2,livro3,livro4,livro5;

    livro1 = new Biblioteca("O senhor dos aneis","Tolkien",1979,"Aventura",3,4,false);
    livro2 = new Biblioteca("Game of Thrones","George R.R. Martin",1999,"Aventura",3,4,false);
    livro3 = new Biblioteca("1984","Orwell",1979,"Aventura",3,4,true);
    livro4 = new Biblioteca("Harry Porter","Tolkien",1979,"Aventura",3,4,true);
    livro5 = new Biblioteca("Biblia","Various",0001,"Aventura",5,6,false);

    System.out.println(livro1.imprimir());

    System.out.println(livro2.imprimir());
    
    System.out.println(livro3.imprimir());
    
    System.out.println(livro4.imprimir());
    
    System.out.println(livro5.imprimir());

    livro5.setEmprestado(true);
    System.out.println(livro5.imprimir());
    }
}