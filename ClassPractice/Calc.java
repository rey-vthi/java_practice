public class Calc {

  public boolean isValidOperator(String cmd) {
    return cmd.matches("^[-+x/]$");
  }

  public boolean isValidExpression(String[] expression) {
    for(int index = 0;index < length; index++) {
      if((index % 2 != 0) && !isValidOperator(expression[index])) {
        return false;
      }
    }
    return true;
  }

  public double performOperation(String operator, double operand1, double operand2) {
    double result = 0.0;

    switch (operator) {
      case "+":
        result = operand1 + operand2;
        break;

      case "-":
        result = operand1 - operand2;
        break;

      case "x":
        result = operand1 * operand2;
        break;

      case "/":
        result = operand1 / operand2;
        break;
    }

    return result;
  }

  public double evaluate(String[] expression) {
    int expLength = expression.length;
    double result = expLength > 0 ? Double.parseDouble(expression[0]) : 0;

    for(int index = 1; index < expLength; index += 2) {

        double operand2 = Double.parseDouble(expression[index + 1]);
        result = performOperation(expression[index], result, operand2);

    }
    
    return result;
  }

  public static void main(String[] args) {

    Calculator calculator = new Calculator(args);

    if(calculator.isValidExpression()) {
      System.out.println(calculator.evaluate());
      return;
    }

    System.out.println("Please enter a valid expression");
  }
}