public class Biblioteca{

        private String titulo;
        private String autor;
        private int anoPub;
        private String categoria;
        private int estante;
        private int prateleira;
        private boolean emprestado;


    public Biblioteca(String tit, String aut, int ano, String cat, int est, int prat, boolean emp){
        titulo = tit;
        autor = aut;
        anoPub = ano;
        categoria = cat;
        estante = est;
        prateleira = prat;
        emprestado = emp;

    }

    public void setTitulo(String tit){
        titulo = tit;

    }
    
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String aut){
        autor = aut;

    }
    
    public String getAutor(){
        return autor;
    }

    public void setAnoPub(int ano){
        anoPub = ano;
    }

    public int getAnoPub(){
        return anoPub;
    }

    public void setCategoria(String cat){
        categoria = cat;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setEstante(int est){
        estante = est;
    }

    public int getEstante(){
        return estante;
    }

    public void setPrateleira(int prat){
        prateleira = prat;
    }

    public int getPrateleira(){
        return prateleira;
    }

    public void setEmprestado(boolean emp){
        emprestado = emp;
    }

    public boolean getEmprestado(){
        return emprestado;
    }

    public String imprimir(){
        if(emprestado==true){
        return "O livro "+titulo+", esta disponivel e localizado na estante "+estante+" e prateleira "+prateleira;
        } else {
            return "O livro "+titulo+", esta emprestado"; 
        }
    }



    }
