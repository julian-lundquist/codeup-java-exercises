package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Input a = new Input(scn);
        a.yesNo();
        a.getInt(1, 10);
        a.getDouble(1, 20);
    }
}
