import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Converter {
    public ExchangeRate exchangeRate(String base_code, String target_code, double conversion_result) {
        String key = "5066af3be65a3da3d2923e35";
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/pair/" + base_code + "/" + target_code + "/" + conversion_result);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ExchangeRate.class);

        } catch (Exception e) {
            throw new RuntimeException("Não consigo converter.");
        }
    }

}


