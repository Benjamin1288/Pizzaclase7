package pkgPizzabase;

import java.util.ArrayList;
import java.util.List;

    public class Pizza {
    private String name;
    private double price;

    //Constructor
        public Pizza(String name,Topping... toppings){
            this.name=name;
            this.toppings = new ArrayList<>();
            for (Topping tp: toppings){
                this.toppings.add(tp);
            }
            calculatePrice();
        }
        public void prepararPizza() {
            System.out.println("Preparando la pizza " + name + "...");
            try {
                Thread.sleep(5000);//se tarda 5 segundos
                System.out.println("¡La pizza " + name + " está lista para servir!");
            } catch (InterruptedException e) {
                System.err.println("Error al preparar la pizza: " + e.getMessage());
            }
        }
        private void calculatePrice() {
            double totalPrice = 0.0;
            for (Topping tp : toppings) {
                totalPrice += tp.getPrice();
            }
            this.price = totalPrice;
        }

        public void addTopping(Topping topping){
            this.toppings.add(topping);
            calculatePrice();
        }
        public void removeTopping(Topping index){
            this.toppings.remove(index);
            calculatePrice();
        }
        @Override
        public String toString(){
            return "Pizza:{"+name+" Precio="+price+"}";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public List<Topping> getToppings() {
            return toppings;
        }

        public void setToppings(List<Topping> toppings) {
            this.toppings = toppings;
        }

        private List<Topping> toppings=new ArrayList<>();
}
