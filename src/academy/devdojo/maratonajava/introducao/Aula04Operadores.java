package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // % (Pode usar para saber se é par ou impar
        int resto = 20 % 2;
        System.out.println(resto);

        //  < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez "+isDezIgualQueDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // &&(AND) || (OR) ! (NOT)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;

        System.out.println(bonus);

        // ++ --
        int contador = 0;
        //contador += 1;
        contador++;
        //contador--;
        //++contador;
       //--contador;
        int contador2 = 0;
        System.out.println("contador++ "+contador); //primeiro imprime e depois soma
        //System.out.println("++contador "+contador); //primeiro incrementa e depois executa
    }
}
