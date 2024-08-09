public class Calculator {
    public float multiplication(float a, float b) {
        return a * b;
    }

    public float division(float a, float b) {
        if (b != 0) {
            return a / b;
        }
        return 0f;
    }
}
