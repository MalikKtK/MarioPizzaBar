public class pizzaBar {
    private Menu menu;
    private userInterface ui;

    public void run() {
        menu.CreatePizza();
        showMenu();
    }

    public void showMenu() {
        ui.printMenu(menu.getPizzaMenu());
    }
}
