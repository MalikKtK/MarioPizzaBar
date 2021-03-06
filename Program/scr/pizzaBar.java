import java.util.ArrayList;

public class pizzaBar {
    private Menu menu;
    private userInterface ui;
    private ArrayList<Order> orders;

    public void run() {
        ArrayList<String> options = new ArrayList<>();
        options.add("1" + ". Show Menu:");
        options.add("2" + ". Create order:");
        options.add("3" + ". View orders:");
        options.add("4" + ". Finish order:");
        options.add("5" + ". Delete order:");
        options.add("6" + ". Exit program:");

        ui = new userInterface();
        menu = new Menu("Options:", "Choose: ", options);
        orders = new ArrayList<>();

        int choice;
        do {
            ui.printOptionsMenu(menu);
            choice = validateChoice("Invalid choice");
            switch (choice) {
                case 1 -> showMenu();
                case 2 -> createOrder();
                case 3 -> viewOrders();
                case 4 -> finishOrder();
                case 5 -> deleteOrder();
                case 6 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 9);
    }


    public void showMenu() {
        menu.printPizzaMenu();
    }

    public void createOrder() {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        String temp = validatePickUp();
        System.out.println("Select your order - type 0 to finish");

        int count = 1;

        int choice = -1;
        while (choice != 0) {
            System.out.println("Pizza " + count + ": ");
            choice = validRange(1, 15);

            for (Pizza p : menu.getMenu()) {
                if (p.getPizzaNumber() == choice && choice != 0) {
                    pizzas.add(p);
                }
            }
            count++;
        }

        if (pizzas.size() > 0) {
            String option;
            Order order = new Order(pizzas, temp);
            System.out.println("Total price: ");
            System.out.println(order.totalPricePizza() + " KR.");
            System.out.println();
            System.out.println("Is there a time of collection?: (y/n)");
            option = ui.getString();
            switch (option) {
                case "y" -> {
                    int time;
                    int minut;
                    System.out.println("Enter hour:");
                    time = ui.getInt();
                    System.out.println("Enter minute:");
                    minut = ui.getInt();
                    order.setPickUpTime(time, minut);
                }
                case "n" -> System.out.println("Alright, time of collection is set as fastest-possible.");
                default -> System.out.println("Please enter y for yes or n for no.");
            }
            orders.add(order);
        }

    }

    public void viewOrders() {
        if (orders.size() != 0) {
            for (Order o : orders) {
                System.out.println(o.toString());
            }
        } else {
            System.out.println("There are no orders");
        }
    }

    public void finishOrder() {
        int id = getValidId();
        deleteOrder(id);
        System.out.println("Finished order #" + id);
    }

    public void deleteOrder() {
        int id = getValidId();
        orders.remove(findOrder(id));
    }

    public void deleteOrder(int id) {
        orders.remove(findOrder(id));
    }

    public int getValidId() {
        System.out.println("Enter order ID: ");
        int id = validateChoice("Invalid choice");

        if (orderIds().contains(id)) {
            return id;
        } else {
            System.out.println("Not a valid ID");
        }
        return 0;
    }

    public ArrayList<Integer> orderIds() {
        ArrayList<Integer> ids = new ArrayList<>();
        for (Order o : orders) {
            ids.add(o.getID());
        }
        return ids;
    }

    public Order findOrder(int id) {
        for (Order o : orders) {
            if (o.getID() == id) {
                return o;
            }
        }
        return null;
    }

    public int validRange(int range1, int range2) {
        int choice = validateChoice("Invalid input, enter a new number");

        while (!(choice >= range1 && choice <= range2 || choice == 0)) {
            System.out.println("Out of range, enter a new number");
            choice = validateChoice("Invalid input, enter a new number");
        }

        return choice;
    }

    public int validateChoice(String text) {
        int choice = -1;
        while (choice == -1) {
            if (ui.hasNextInt()) {
                choice = ui.getInt();
            } else {
                System.out.println(text);
            }
            ui.getString();
        }
        return choice;
    }

    public String validatePickUp() {
        System.out.println("Pick up? (y/n) : ");
        String choice = " ";
        String answer1 = "Called";
        String answer2 = "In store";

        while (!(choice.equals("y") || choice.equals("n"))) {
            choice = ui.getString();
            if (!(choice.equals("y") || choice.equals("n"))) {
                System.out.println("Invalid choice");
            }
        }

        if (choice.equals("y")) {
            return answer1;
        } else {
            return answer2;
        }
    }
}
