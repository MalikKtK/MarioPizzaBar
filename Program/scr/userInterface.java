import java.util.Scanner;

public class userInterface {
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public void printOptionsMenu(Menu menu) {
        System.out.print(menu.getOptions());
        System.out.println(menu.getUserChoice());
        System.out.print(menu.getOptionsText());
    }

    public boolean hasNextInt() {
        return scanner.hasNextInt();
    }
}