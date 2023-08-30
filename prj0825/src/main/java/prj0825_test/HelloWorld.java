package prj0825_test;

public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
