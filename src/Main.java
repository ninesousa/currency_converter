import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("""
                ********************************************************
                Selecione uma opção de conversão:
                1) Dólar Americano para Real
                2) Real para Dólar Americano
                3) Dólar Americano para Peso Argentino
                4) Peso Argentino para Dólar Americano
                5) Dólar Americano para Euro
                6) Euro para Dólar Americano
                7) Sair
                                    
                Escolha uma opção válida:
                """);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Pair pair = new Pair();
        Converter converter = new Converter();
        int choice = 0;
        double currency;


        while (true) {
            menu();

            try {
                choice = read.nextInt();

                if (choice < 1 || choice > 7) {
                    System.out.println("Digite uma opção entre 1 e 7");
                    continue;
                } else if (choice == 7) {
                    System.out.println("Saindo do programa...");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("O programa espera um número entre 1 e 7");
                read.next();
                continue;
            }

            pair.choiceConversor(choice);

            System.out.print("Digite o valor a ser convertido: ");
            currency = read.nextDouble();

            ExchangeRate exchangeRate = converter.exchangeRate(pair.getCurrencyIn(), pair.getCurrencyOut(), currency);

            System.out.println(exchangeRate.toString());

        }

    }
}