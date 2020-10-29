public class Calc {
  public double result;

  public Calculator(double initialResult) {
    this.result = initialResult;
  }

  public double performOperation(double operand, char operator) {

    switch (operator) {
      case "+":
        this.result += operand;
        break;
      case "-":
        this.result -= operand;
        break;
      case "x":
        this.result *= operand;
        break;
      case "/":
        this.result /= operand;
        break;
    }

    return this.result;
  }

  public double getResult() {
    return this.result;
  }

  public static void main(String[] args) {
    double initialResult = args.length > 0 ? Double.parseDouble(args[0]) : 0;

    Calculator calculator = new Calculator(initialResult);

    for (int index = 1; index < args.length; index += 2) {
      double operand = Double.parseDouble(args[index + 1]);
      calc.performOperation(args[index], operand);
    }

    System.out.println(calc.getResult());
  }
}