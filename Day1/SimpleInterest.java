public class SimpleInterest{

  public static double getSimpleInterest(int principal, int rate, int period) {
    return (principal * rate * period) / 100;
  }

  public static void main(String[] args) {

    if(args.length != 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int principal = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    
    System.out.println("Simple Interest is " + getSimpleInterest(principal,rate,period));
  }
}