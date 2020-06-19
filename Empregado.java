public class Empregado{
    private String nome; 
    private String cargo;
    private Double salario;

    public Empregado(String no, String ca, Double sal){
        nome = no;
        cargo = ca;
        salario = sal;
    }

public void setNome(String no){
    nome = no;

}
public String getNome(){
    return nome;
}

public void setCargo(String ca){
    cargo = ca;
}

public String getCargo(){
    return cargo;
}

public void setSalario(Double sa){
    salario = sa;
}

public Double getSalario(){
    return salario;
}

public String imprimir(){
    return "O funcionario "+ nome +" cargo: " + cargo + " recebe de salário: R$" + salario; 
    
}

public void aumentasalario(double percentual){
    salario = salario + salario / percentual * 100;
}


}