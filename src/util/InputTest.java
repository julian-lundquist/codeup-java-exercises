package util;

public class InputTest {
    public static void main(String[] args) {
        Input a = new Input();
        a.yesNo();
        a.getInt(1, 10);
        a.getDouble(1, 20);
    }
}
