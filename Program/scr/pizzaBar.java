public class pizzaBar {
    private Menu menu;
    private userInterface ui;

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
