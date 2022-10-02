package day_47_collections;

import my_utils.StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, Double> store = new HashMap<>(
                Map.of("Water", 2.99, "Bread", 4.55, "Milk", 2.89, "Fruits", 3.31)
        );
        System.out.println(store);

        System.out.println("What item are would you like");
        String item = StringUtil.fixFormat(input.next());
        if(store.containsKey(item)){
            System.out.println(item + " is in stock");
            System.out.println("Price is $" + store.get(item));
        } else {
            System.out.println(item + " is not in stock");
        }





    }
}