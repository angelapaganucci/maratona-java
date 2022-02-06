package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Angela";
        estudante01.idade = 39;
        estudante01.sexo = 'F';

        estudante02.nome = "Giovanna";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
