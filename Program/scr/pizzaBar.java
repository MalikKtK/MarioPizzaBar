public class pizzaBar {
    private Menu menu;
    private userInterface ui;

    public void run() {
        menu = new Menu();
        ui = new userInterface();
        menu.CreatePizza();
        showMenu();
//        int userInput;
//        do {
//            switch (userInput) {
//                case 1 -> showMenu();
////                case 2 -> createOrder();
////                case 3 -> viewOrders();
////                case 4 -> finishOrder();
////                case 5 -> deleteOrder();
////                case 6 -> exit();
//                default -> System.out.println("Invalid choice");
//            }
//            while (userInput != 6) ;
//
//        }
    }

    public void showMenu() {
        ui.printString(menu.getPizzaMenu());
    }
}
