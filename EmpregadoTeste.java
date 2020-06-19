public class EmpregadoTeste{
    public static void main(String args[]){
        Empregado Emp1, Emp2, Emp3;

        Emp1 = new Empregado("Thiago","Analista",10000.00);
        Emp2 = new Empregado("Simone","Adm",5000.00);
        Emp3 = new Empregado("Pedro","Estag",1000.00);

        System.out.println(Emp1.imprimir());
        System.out.println(Emp2.imprimir());
        System.out.println(Emp3.imprimir());

        Emp1.aumentarsalario(10);
        Emp2.aumentarsalario(8);
        Emp3.aumentarsalario(7);

        System.out.println(Emp1.imprimir());
        System.out.println(Emp2.imprimir());
        System.out.println(Emp3.imprimir());

    }
}