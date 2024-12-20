import java.util.ArrayList;
import java.util.Scanner;

public class Display {

    public static void displaymenu(User user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. rice = 500 \n2. wheat = 450 \n3. paddy = 300");
        System.out.println("If you want to stop press 0");
        
        int c = sc.nextInt();
        Fulloder fd = new Fulloder(Main.oid++);  // Using Main.oid as oid is static in Main class
        while (c != 0) {
            if (c == 1) {
                Order ord = new Order();
                ord.name = "rice";
                System.out.println("Enter kgs");
                int price = sc.nextInt();
                ord.val = price;

                if (Stock.rice.avail >= price) {
                    Stock.rice.avail -= price;
                    fd.orde.add(ord);
                } else {
                    System.out.println("Not available at the moment");
                }
            } else if (c == 2) {
                Order ord = new Order();
                ord.name = "wheat";
                System.out.println("Enter kgs");
                int price = sc.nextInt();
                ord.val = price;

                if (Stock.wheat.avail >= price) {
                    Stock.wheat.avail -= price;
                    fd.orde.add(ord);
                } else {
                    System.out.println("Not available at the moment");
                }
            } else if (c == 3) {
                Order ord = new Order();
                ord.name = "paddy";
                System.out.println("Enter kgs");
                int price = sc.nextInt();
                ord.val = price;

                if (Stock.paddy.avail >= price) {
                    Stock.paddy.avail -= price;
                    fd.orde.add(ord);
                } else {
                    System.out.println("Not available at the moment");
                }
            }
            c = sc.nextInt();
        }
        
        user.orders.add(fd);
        Main maini=new Main();
        maini.Fullorder.add(fd);
        System.out.println("Order placed successfully!");

        for (Order o : fd.orde) {
            System.out.println(o.name + " " + o.val);
        }
    }

    public static void displaystock() {
        System.out.println("rice : " + Stock.rice.avail);
        System.out.println("wheat : " +Stock.wheat.avail);
        System.out.println("paddy : " + Stock.paddy.avail);
    }
}
