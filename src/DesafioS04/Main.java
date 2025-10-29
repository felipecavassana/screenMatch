package DesafioS04;

import DesafioS04.utils.FileRecord;
import DesafioS04.record.Address;
import DesafioS04.controller.AddressController;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lecture = new Scanner(System.in);
        System.out.printf("Digite um cep para buscar informações: ");
        String cep = lecture.nextLine();

        AddressController addressController = new AddressController();
        try {
            Address addressSearched = addressController.searchCepRest(cep);
            System.out.println(addressSearched);

            FileRecord fileRecord = new FileRecord();
            fileRecord.saveCepJsonFile(addressSearched);

        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Aplicação finalizada");
        }
    }
}
