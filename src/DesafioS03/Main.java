package DesafioS03;

import DesafioS03.model.CreditCard;
import DesafioS03.model.Order;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecture = new Scanner(System.in);

        System.out.printf("Digite o valor do limite: ");
        double limit = lecture.nextDouble();

        CreditCard creditCard = new CreditCard(limit);

        int optionIn = 1;
        while (optionIn != 0) {
            System.out.printf("Digite 1 para comprar, 0 para sair: ");
            optionIn = lecture.nextInt();

            if (optionIn == 1){
                System.out.println("Nome do item: ");
                String itemName = lecture.next();
                System.out.println("Valor do item: ");
                double itemPrice = lecture.nextDouble();

                Order newOrder = new Order(itemName, itemPrice);

                if (creditCard.validateLimit(itemPrice)){
                    creditCard.buyItem(newOrder);
                } else {
                    System.out.println("Limite insuficiente. Compra encerrada.");
                    optionIn = 0;
                }

            }
        }

        Collections.sort(creditCard.getOrders());

        System.out.println("\n********************");
        System.out.println("Compras Realizadas\n");
        for (Order orderItem : creditCard.getOrders()){
            System.out.println(orderItem);
        }
        System.out.println("\n********************");
        System.out.println("Saldo do cartão: $ "+ creditCard.getLimit());

    }
}
