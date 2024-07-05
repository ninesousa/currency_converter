public class Pair {
    private String currencyIn;
    private String currencyOut;

    public String getCurrencyIn() {
        return currencyIn;
    }

    public String getCurrencyOut() {
        return currencyOut;
    }

    public void choiceConversor(int choice) {
        switch (choice) {
            case 1 -> {
                currencyIn = "USD";
                currencyOut = "BRL";
            }
            case 2 -> {
                currencyIn = "BRL";
                currencyOut = "USD";
            }
            case 3 -> {
                currencyIn = "USD";
                currencyOut = "ARS";
            }
            case 4 -> {
                currencyIn = "ARS";
                currencyOut = "USD";
            }
            case 5 -> {
                currencyIn = "USD";
                currencyOut = "EUR";
            }
            case 6 -> {
                currencyIn = "EUR";
                currencyOut = "USD";
            }
            case 7 -> System.out.println("Saindo do programa...");
            default -> System.out.println("Opção inválida.");
        }
    }
}