public class Pizza {
    private final String pizzaName;
    private final String toppings;
    private final double pizzaPrice;
    private final int pizzaNumber;

    Pizza(String pizzaName, String toppings, double pizzaPrice, int pizzaNumber){
        this.pizzaName = pizzaName;
        this.toppings = toppings;
        this.pizzaPrice = pizzaPrice;
        this.pizzaNumber = pizzaNumber;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getToppings() {
        return toppings;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", toppings='" + toppings + '\'' +
                ", pizzaPrice=" + pizzaPrice +
                ", pizzaNumber=" + pizzaNumber +
                '}';
    }
}
