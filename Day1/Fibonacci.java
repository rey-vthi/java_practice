public class Fibonacci {

  public static void printFibonacciSeries(int numOfTerms) {
    int currentNum = 0;
    int nextNum = 1;

    for(int term = 1; term <= numOfTerms; term++){
      System.out.println(currentNum);
      nextNum = currentNum + nextNum;;
      currentNum = nextNum - currentNum;
    }
  }
  
  public static void main(String[] args) {
    if(args.length != 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int numOfTerms = Integer.parseInt(args[0]);

    printFibonacciSeries(numOfTerms);
  }
}