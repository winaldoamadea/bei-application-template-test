package src.main.java.com.traveloka.bootcamp.addition.model;

public class AddRequest {
    private int a;
    private int b;

    public AddRequest() {}

    public AddRequest(int a, int b) { // bad practice, especially for a lot of arguments, use @Builder instead
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}