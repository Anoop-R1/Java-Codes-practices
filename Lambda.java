interface Displayable {
    void display();
}

public class Lambda {
    public static void main(String[] args) {
        Displayable obj = () -> System.out.println("Hello, world!");
        obj.display();
    }
}

