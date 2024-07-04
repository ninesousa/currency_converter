import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    public ExchangeRate convert(double currency, String currencyIn, String currencyOut) {
        String key = System.getenv("KEY_EXCHANGE");
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/pair/" + currencyIn + "/" + currencyOut);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ExchangeRate.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o resultado.");
        }
    }

}
