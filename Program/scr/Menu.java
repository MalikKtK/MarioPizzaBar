import java.util.ArrayList;

public class Menu {
    private ArrayList<Pizza> pizzaMenu = new ArrayList<>();

    public void CreatePizza() {
        Pizza p1 = new Pizza("Vesuvio","tomatsauce, ost, skinke og oregano",57,1);
        Pizza p2 = new Pizza("Amerikaner","tomatsauce, ost, oksefars og oregano",53,2);
        Pizza p3 = new Pizza("Cacciatore","tomatsauce, ost, pepperoni og oregano",57,3);
        Pizza p4 = new Pizza("Carbano","tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano",63,4);
        Pizza p5 = new Pizza("Dennis","tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano",65,5);
        Pizza p6 = new Pizza("Bertil","tomatsauce, ost, bacon og oregano",57,6);
        Pizza p7 = new Pizza("Silvia","tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano",61,7);
        Pizza p8 = new Pizza("Victoria","tomatsauce, ost, skinke, ananas, champignon, løg og oregano",61,8);
        Pizza p9 = new Pizza("Toronfo","tomatsauce, ost, skinke. bacon, kebab, chili og oregano",61,9);
        Pizza p10 = new Pizza("Capricciosa","tomatsauce, ost, skinke, champignon og oregano",61,10);
        Pizza p11 = new Pizza("Hawai","tomatsauce, ost, skinke, ananas og oregano",61,11);
        Pizza p12 = new Pizza("Le Blissola","tomatsauce, ost, skinke, rejer og oregano",61,12);
        Pizza p13 = new Pizza("Venezia","tomatsauce, ost, skinke, bacon og oregano",61,13);
        Pizza p14 = new Pizza("Mafia","tomatsauce, ost, pepperoni, bacon, løg og oregano",61,14);
        Pizza p15 = new Pizza("Salat Pizza","tomatsauce, ost, salat, kebab, ost, tomat, argurk, salat dressing",50,15);
    }
}
