package academy.devdojo.maratonajava.javacore.Gexercicioassociacao.test;

import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gexercicioassociacao.dominio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das Andorinhas");
        Aluno aluno = new Aluno("Angela Paganucci", 39);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar um seminário", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprimi();

    }
}
