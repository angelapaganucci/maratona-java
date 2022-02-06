package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double taxa;

        if(salarioAnual <= 34712){
            taxa = salarioAnual * 0.097;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            taxa = salarioAnual * 0.3735;
        }else{
            taxa = salarioAnual * 0.4950;
        }
        System.out.println("Taxa R$"+taxa);

    }
}
