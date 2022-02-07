package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180d);

        Carro c1 = new Carro("BMW",280d);
        Carro c2 = new Carro("Mercedes", 275d);
        Carro c3 = new Carro("Audi", 290d);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
