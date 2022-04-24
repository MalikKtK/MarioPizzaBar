public record Pizza(String pizzaName, String toppings, double pizzaPrice, int pizzaNumber) {

    public String getPizzaName() {
        return pizzaName;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    @Override
    public String toString() {
        return pizzaNumber + ". " + pizzaName.toUpperCase() + ": " + toppings + "..................." + pizzaPrice + ",-";
    }
}
