package DesafioS04.controller;

import DesafioS04.record.Address;
import DesafioS04.rest.ApiRest;
import com.google.gson.Gson;

public class AddressController {
    public Address searchCepRest(String cep) {

        String uri = "http://viacep.com.br/ws/"+ cep +"/json/";
        String apiResponse = new ApiRest().getApiRest(uri);

        try {
            return new Gson().fromJson(apiResponse, Address.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível buscar o endereço");
        }
    }
}
