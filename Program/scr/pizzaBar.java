public class pizzaBar {
    private Menu menu = new Menu();
    private userInterface ui = new userInterface();

    public void run() {
        menu = new Menu();
        ui = new userInterface();
        menu.CreatePizza();
        showMenu();
    }

    public void showMenu() {
        ui.printString(menu.getPizzaMenu());
    }
}
