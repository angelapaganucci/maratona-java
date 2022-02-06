package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double total = calculadora.divideDoisNumeros(50,0);

        System.out.println(total);
        System.out.println("______________________");
        calculadora.imprimeDivisaoDeDoisNumeros(85,6);
    }
}
