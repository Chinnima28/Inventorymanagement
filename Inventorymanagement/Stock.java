public class Stock {
    public static Item rice = new Item("rice", 10);
    public static Item paddy = new Item("paddy", 15);
    public static Item wheat = new Item("wheat", 10);

    public static void receive(int val, Item item) {
        item.avail += val;
    }

    public static void consume(int val, Item item) {
        item.avail -= val;
    }
}
