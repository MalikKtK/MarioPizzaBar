public class pizzaBar {
    private Menu menu = new Menu();
    private userInterface ui = new userInterface();

    public void run() {
        menu.CreatePizza();
        showMenu();
    }

    public void showMenu() {
        ui.printMenu(menu.getPizzaMenu());
    }
}
