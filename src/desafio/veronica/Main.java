package desafio.veronica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String limitMenu = "Digite o limite do cartão: ";
        String ProductMenu = "Digite a descrição da compra: ";
        String ValueMenu = "Digite o valor da compra: ";
        String menuOut = "\n Digite 0 para sair ou 1 para continuar";
        String product;
        int option = 1;
        double price;
        double limit;
        Scanner input = new Scanner(System.in);
        ArrayList<Shopping> total = new ArrayList<>();

        System.out.println(limitMenu);
        limit = input.nextInt();


        while (option != 0) {
            Shopping shopping  = new Shopping(limit);

            System.out.println(ProductMenu);
            product = input.next();

            System.out.println(ValueMenu);
            price = input.nextInt();

            if (limit >= price) {

                shopping.setProduct(product);
                shopping.setPrice(price);

                shopping.addShopping(price);
                shopping.setBalance(price);
                limit -= price;

                total.add(shopping);

            } else {

                System.out.println("Saldo Insuficiente");
                break;
            }

            System.out.println(menuOut);
            option = input.nextInt();

        }

        total.sort(Comparator.comparing(Shopping::getPrice));

        System.out.println("**********************************");
        System.out.println("COMPRAS REALIZADAS: \n");

        for (Shopping item:total) {
            System.out.println(item.getProduct() + " - " + item.getPrice());
        }

        System.out.println("\n**********************************");
        System.out.println("\n Saldo do cartão: " + limit);

    }
}