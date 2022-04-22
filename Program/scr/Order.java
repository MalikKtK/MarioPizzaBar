import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Order {
    private final String DATETIME;
    private final int ID;
    private static int count;
    private String pickUpStatus;
    private final ArrayList<Pizza> orderList;

    public Order(ArrayList<Pizza> thisOrder, String status) {
        orderList = thisOrder;
        setPickUpStatus(status);
        count++;
        ID = count;

        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        DATETIME = df.format(today);
    }

    public Order(ArrayList<Pizza> thisOrder, String status, String date) {
        orderList = thisOrder;
        setPickUpStatus(status);
        count++;
        ID = count;
        DATETIME = date;
    }

    public int getID() {
        return ID;
    }

    public void setPickUpStatus(String pickUpStatus) {
        this.pickUpStatus = pickUpStatus;
    }


    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("#").append(ID).append(" ").append(pickUpStatus).append(" - ");
        for (int i = 0; i < orderList.size() - 1; i++) {
            text.append(orderList.get(i).getPizzaName()).append(", ");
        }
        text.append(orderList.get(orderList.size() - 1).getPizzaName()).append(" ");
        text.append("- ");
        text.append(DATETIME);
        return text.toString();
    }

    public double totalPricePizza() {
        double sum = 0;
        for (Pizza pizza : orderList) {
            sum += pizza.getPizzaPrice();
        }
        return sum;
    }
}
