import java.util.HashMap;
import java.util.Map;

public class Pair {
    private String currencyIn;
    private String currencyOut;

    public String getCurrencyIn() {
        return currencyIn;
    }

    public void setCurrencyIn(String currencyIn) {
        this.currencyIn = currencyIn;
    }

    public String getCurrencyOut() {
        return currencyOut;
    }

    public void setCurrencyOut(String currencyOut) {
        this.currencyOut = currencyOut;
    }
    private static final Map<Integer, String[]> optionsCurrencies = new HashMap<>();
    static {
        optionsCurrencies.put(1, new String[]{"USD", "BRL"});
        optionsCurrencies.put(2, new String[]{"BRL", "USD"});
        optionsCurrencies.put(3, new String[]{"USD", "ARS"});
        optionsCurrencies.put(4, new String[]{"ARS", "USD"});
        optionsCurrencies.put(5, new String[]{"USD", "EUR"});
        optionsCurrencies.put(6, new String[]{"EUR", "USD"});
    }

    public void choiceConversor (int choice) {
        String[] moedas = optionsCurrencies.get(choice);
        if (moedas != null) {
            setCurrencyIn(moedas[0]);
            setCurrencyOut(moedas[1]);
        } else if (choice == 7) {
            System.out.println("Saindo do programa...");
            System.exit(0);
        } else {
            System.out.println("Opção inválida.");
        }
    }

}