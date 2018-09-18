package poly;

public class MathFunc {
    int calls;

    public int getCalls() {
        return calls;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public long factorial(int number) {
        calls++;

        if (number < 0) {
            throw new IllegalArgumentException();
        }

        long result = 1;

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        return result;
    }

    public long plus(int number1, int number2) {
        calls++;
        return number1 + number2;
    }
}
