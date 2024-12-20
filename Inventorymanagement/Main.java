import java.util.*;

public class Main {
    static int uid = 1;
    static int oid = 1;
    static ArrayList<Fulloder> Fullorder = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        System.out.println("Please find the below choices and choose whichever suitable for you");
        System.out.println("1. New user\n2. User ID\n3. Update Stock");
        int c = sc.nextInt();

        if (c == 1) {
            sc.nextLine(); // To consume the newline character left by nextInt
            System.out.println("Enter Your Name");
            String names = sc.nextLine();
            User user = new User(uid++, names);

            System.out.println("If you want to place an order");
            Display.displaymenu(user);
            users.add(user);
        } else if (c == 2) {
            System.out.println("Enter your User ID:");
            int id = sc.nextInt();
            boolean t = false;

            for (User user : users) {
                if (user.id == id) {
                    Display.displaymenu(user);
                    t = true;
                    break;
                }
            }
            if (!t) {
                System.out.println("No such ID exists");
            }
        } else if (c == 3) {
            System.out.println("1. Receiving stock \n2. Stock details");
            int choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine(); // To consume the newline character left by nextInt
                System.out.println("Enter the name and the quantity of the item to be received for stock:");
                String name = sc.nextLine();
                int quantity = sc.nextInt();

                if (name.equals("rice"))
                    Stock.receive(quantity, Stock.rice);
                else if (name.equals("paddy"))
                    Stock.receive(quantity, Stock.paddy);
                else if (name.equals("wheat"))
                    Stock.receive(quantity, Stock.wheat);
            }

            if (choice == 2) {
                Display.displaystock();
            }
        }
    }
}
