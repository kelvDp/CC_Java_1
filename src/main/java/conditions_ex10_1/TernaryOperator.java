package conditions_ex10_1;

public class TernaryOperator {
    public static void main(String[] args) {

        // normal if/else statement
        int x = 4, y = 9;

        if ((y / x) < 3) {
            x += y;
        } else
            x *= y;

        // ternary operator
        x = ((y / x) < 3) ? (x += y) : (x *= y);
    }
}
