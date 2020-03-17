public class Calculator {
    private int add;
    private int subtract;
    private int multiply;
    private double divide;

    public Calculator(int add, int subtract, int multiply, double divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

}
