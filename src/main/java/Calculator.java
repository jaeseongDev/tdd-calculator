public class Calculator {

    public int plus(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        int result = 0;
        for (int i = 0; i < y; i++) {
            result += x;
        }
        return result;
    }
}
