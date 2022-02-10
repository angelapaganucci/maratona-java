package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua");
        endereco.setCep("14110-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome");
        pessoa.setCpf("222.415.488-71");
        pessoa.setEndereco(endereco);
        pessoa.imprimi();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Funcionario");
        funcionario.setCpf("244155");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000d);
        System.out.println("---------------");
        funcionario.imprimi();
    }
}
