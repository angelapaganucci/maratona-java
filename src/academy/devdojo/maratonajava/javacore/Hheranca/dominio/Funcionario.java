package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    static {
        System.out.println("Dentro do bloco estatico de funcionário");
    }
    {
        System.out.println("Bloco de inicialização de funcionário 1");
    }
    {
        System.out.println("Bloco de inicialização de funcionário 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construto de funcionário");
    }

    public void imprimi(){
        super.imprimi();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
