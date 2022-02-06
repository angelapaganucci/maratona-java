package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private Double[] salarios;
    private Double media;

    public void imprimeFuncionario() {
        System.out.println("______________________");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }


        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia salarial " + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(Double[] salarios) {
        this.salarios = salarios;
    }

    public Double getMedia() {
        return media;
    }
}
