package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Angela";
        estudante01.idade = 39;
        estudante01.sexo = 'F';

        estudante02.nome = "Giovanna";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);

        System.out.println("-------------------");

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);



    }
}
