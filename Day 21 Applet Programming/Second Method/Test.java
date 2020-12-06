import java.io.*;
import java.util.*;

class Test {

    public static int randomRange(int lower, int upper) {
        int num = (int) (Math.random() * (upper - lower)) + lower;
        return num;

    }

    public static int randomRange(int lower, int upper, int step) {
        int num = (int) (Math.random() * (upper - lower)) + lower;
        num = num - (num % step);
        return num;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomRange(400, 600));
        }
    }
}