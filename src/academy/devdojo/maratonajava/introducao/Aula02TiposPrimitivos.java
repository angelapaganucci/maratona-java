package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //Tipos primitivos
        int idade = (int) 10000000000L; //cast
        long numeroGrande = 100000;
        double salarioDouble = 2500.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(idade);
        System.out.println("Oi meu nome é " + nome);
    }
}
