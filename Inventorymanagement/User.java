import java.util.ArrayList;

public class User {
    int id;
    String name;
    ArrayList<Fulloder> orders;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }
}
