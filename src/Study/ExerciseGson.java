package Study;

import Study.model.CarModel;
import Study.model.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExerciseGson {
    public static void main(String[] args) {
        Title newtitle = new Title("Matrix", 1999, "Lana Wachowski");

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();

        String titleJson = gson.toJson(newtitle);
        System.out.println(titleJson);

        CarModel newCar = new CarModel();
        newCar.setColor("dark green");
        newCar.setYear(2012);
        newCar.setModel("Sandero");
        newCar.definePrices(55000,45000,35000);

        String carJson = gson.toJson(newCar);
        System.out.println(carJson);
    }
}
