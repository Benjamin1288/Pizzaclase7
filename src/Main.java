import pkgPizzabase.Pizza;
import pkgPizzabase.Topping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Topping peperoni = new Topping("Peperoi", 20);
        Topping tomate = new Topping("Tomate", 15);
        Topping queso = new Topping("Queso", 5);

        Pizza Peperon = new Pizza("Pepperoni pequeña");

        Peperon.addTopping(peperoni);
        Peperon.addTopping(tomate);
        Peperon.addTopping(queso);
        //Peperon.removeTopping(queso);

        Peperon.prepararPizza();

        System.out.println("Pizza: " + Peperon.getName());
        System.out.println("Ingredientes:");
        for (Topping topping : Peperon.getToppings()) {
            System.out.println("-" + topping.getIngredientName() + ": Q" + topping.getPrice());
        }
        System.out.println("Precio total: Q" + Peperon.getPrice());
    }
}