package DesafioS04.utils;

import DesafioS04.record.Address;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileRecord {

    public void saveCepJsonFile(Address address) throws IOException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .serializeNulls()
                .create();

        FileWriter fileWriter = new FileWriter("out/cep_"+address.cep()+".json");
        fileWriter.write(gson.toJson(address));
        fileWriter.close();
    }
}
