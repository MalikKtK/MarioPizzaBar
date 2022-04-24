import java.util.ArrayList;

public class Menu {
    private final ArrayList<Pizza> pizzaMenu = new ArrayList<>();
    private final String options;
    private final String optionsText;
    private final ArrayList<String> userChoice;

    Menu(String options, String optionsText, ArrayList<String> userChoice) {
        this.options = options;
        this.optionsText = optionsText;
        this.userChoice = userChoice;
        CreatePizza();
    }

    public void CreatePizza() {
        Pizza p1 = new Pizza("Vesuvio", "tomatsauce, ost, skinke og oregano", 57, 1);
        pizzaMenu.add(p1);
        Pizza p2 = new Pizza("Amerikaner", "tomatsauce, ost, oksefars og oregano", 53, 2);
        pizzaMenu.add(p2);
        Pizza p3 = new Pizza("Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57, 3);
        pizzaMenu.add(p3);
        Pizza p4 = new Pizza("Carbano", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63, 4);
        pizzaMenu.add(p4);
        Pizza p5 = new Pizza("Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65, 5);
        pizzaMenu.add(p5);
        Pizza p6 = new Pizza("Bertil", "tomatsauce, ost, bacon og oregano", 57, 6);
        pizzaMenu.add(p6);
        Pizza p7 = new Pizza("Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61, 7);
        pizzaMenu.add(p7);
        Pizza p8 = new Pizza("Victoria", "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61, 8);
        pizzaMenu.add(p8);
        Pizza p9 = new Pizza("Toronfo", "tomatsauce, ost, skinke. bacon, kebab, chili og oregano", 61, 9);
        pizzaMenu.add(p9);
        Pizza p10 = new Pizza("Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61, 10);
        pizzaMenu.add(p10);
        Pizza p11 = new Pizza("Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61, 11);
        pizzaMenu.add(p11);
        Pizza p12 = new Pizza("Le Blissola", "tomatsauce, ost, skinke, rejer og oregano", 61, 12);
        pizzaMenu.add(p12);
        Pizza p13 = new Pizza("Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61, 13);
        pizzaMenu.add(p13);
        Pizza p14 = new Pizza("Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61, 14);
        pizzaMenu.add(p14);
        Pizza p15 = new Pizza("Salat Pizza", "tomatsauce, ost, salat, kebab, ost, tomat, argurk, salat dressing", 50, 15);
        pizzaMenu.add(p15);
    }

    public String getOptions() {
        return options;
    }

    public String getOptionsText() {
        return optionsText;
    }


    public void printPizzaMenu(){
        // TODO maybe make menulength an menu attribute for low coupling (i think that's the term))
        int menuLength = 115;
        int dotPadding;
        for (Pizza pizza : pizzaMenu) {
            dotPadding = (4 + ". " + pizza.getPizzaName() + ": " + pizza.toppings() + " ").length();
            System.out.printf("%2d. %S: %s ", pizza.getPizzaNumber(),pizza.getPizzaName(), pizza.toppings());
            for (int i = 0; i <= (menuLength - dotPadding); i++) {
                System.out.print(".");
            }
            System.out.print(" " + pizza.getPizzaPrice() + ",-");
            System.out.println();
        }
        System.out.println();
    }

    public String getUserChoice() {
        StringBuilder text = new StringBuilder();
        for (String userChoice : userChoice) {
            text.append("\n").append(userChoice);
        }
        text.append("\n");

        return text.toString();
    }

    public ArrayList<Pizza> getMenu() {
        return pizzaMenu;
    }

}
