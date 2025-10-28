package Study;

import Study.record.Book;
import Study.record.People;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Scanner;

public class ExercisesRest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecture = new Scanner(System.in);
        ApiRest apiRest = new ApiRest();
        String googleApiKey = null;

        System.out.printf("Digite o nome de um livro: ");
        var searchBook = lecture.nextLine();
        searchBook = URLEncoder.encode(searchBook);
        String urlApiGoogleBook = "https://www.googleapis.com/books/v1/volumes?q="+ URLEncoder.encode(searchBook) +"&key="+ googleApiKey;
        String response1 = apiRest.getAPI(urlApiGoogleBook);
        System.out.println(response1);

        System.out.printf("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin): ");
        var criptoNome = lecture.nextLine();
        String urlApiCoinGecko = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome + "&vs_currencies=usd";
        String response2 = apiRest.getAPI(urlApiCoinGecko);
        System.out.println(response2);

        System.out.printf("Digite o nome da receita para a busca: ");
        var nomeReceita = lecture.nextLine();
        String urlTheMealDB = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + URLEncoder.encode(nomeReceita);
        String response3 = apiRest.getAPI(urlTheMealDB);
        System.out.println(response3);

        conversaoJsonParaObjeto();
        conversaoJsonAninhadoParaObjeto();
    }

    public static void conversaoJsonParaObjeto(){
        String jsonPessoa = "{\"name\":\"Felipe\",\"age\":37,\"city\":\"Oxford\"}";
        Gson gson = new GsonBuilder().setLenient().create();
        People people = gson.fromJson(jsonPessoa, People.class);
        System.out.println("Object People: " + people);
    }

    public static void conversaoJsonAninhadoParaObjeto() {
        String jsonLivro = "{\"title\":\"Aventuras do Java\",\"author\":\"Akemi\",\"publisher\":{\"name\":\"TechBooks\",\"city\":\"São Paulo\"}}";
        Gson gson = new Gson();
        Book book = gson.fromJson(jsonLivro, Book.class);
        System.out.println("Object Book: " + book);
    }

}
