public class Fibonacci {
  public static void main(String[] args) {
    int fibonacciTerms = Integer.parseInt(args[0]);
    int num1 = -1;
    int num2 = 1;
    int currentNum;

    while(fibonacciTerms>0) {
      currentNum = num1 + num2;
      num1 = num2;
      num2 = currentNum;
      fibonacciTerms--;
      System.out.println(currentNum);
    }
  }
}