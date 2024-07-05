public record ExchangeRate(String base_code, String target_code, double conversion_result) {
    @Override
    public String toString() {
        return "Conversão de " + base_code + " para " + target_code + ": " + conversion_result;
    }
}
