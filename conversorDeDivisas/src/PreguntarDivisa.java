import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PreguntarDivisa {
    public Divisas buscarDivisa(String divisaBase, String divisaUsuario){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/97be38701b96bf37b7bf6038/pair/" + divisaBase + "/" + divisaUsuario);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = ((HttpClient) client)
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisas.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la divisa");
        }
    }
}
