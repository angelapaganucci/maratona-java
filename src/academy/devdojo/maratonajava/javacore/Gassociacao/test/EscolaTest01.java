package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Maria");
        Professor professor1 = new Professor("João");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Escola", professores);

        escola.imprime();
    }
}
