package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Angela");
        funcionario.setIdade(39);
        funcionario.setSalarios(new Double[]{1200.0, 987.32, 2000.0});
        funcionario.imprimeFuncionario();
        System.out.println("Média " + funcionario.getMedia());
    }
}
