package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Golf";
        carro01.modelo ="Sportline";
        carro01.ano = "2009";

        carro02.nome = "Fusca";
        carro02.modelo ="Sport";
        carro02.ano = "1968";

        carro01 = carro02;

        System.out.println("\nCarro 01");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCarro 02");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);


    }
}
