package Study;

import java.io.IOException;
import java.util.Scanner;

public class ExercisesRest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecture = new Scanner(System.in);
        ApiRest apiRest = new ApiRest();
        String googleApiKey = "AIzaSyDLOwG8f9eKL7EAp9_qqcRmtzT0fNjKK-g";

        System.out.printf("Digite o nome de um livro: ");
        var searchBook = lecture.nextLine();
        String urlApiGoogleBook = "https://www.googleapis.com/books/v1/volumes?q="+ searchBook +"&key="+ googleApiKey;
        String response1 = apiRest.getAPI(urlApiGoogleBook);
        System.out.println(response1);

        System.out.printf("Digite o nome da criptomoeda para a cotação (por exemplo, bitcoin): ");
        var criptoNome = lecture.nextLine();
        String urlApiCoinGecko = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptoNome + "&vs_currencies=usd";
        String response2 = apiRest.getAPI(urlApiCoinGecko);
        System.out.println(response2);

        System.out.printf("Digite o nome da receita para a busca: ");
        var nomeReceita = lecture.nextLine();
        String urlTheMealDB = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;
        String response3 = apiRest.getAPI(urlTheMealDB);
        System.out.println(response3);



    }
}
