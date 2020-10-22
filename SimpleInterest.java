public class SimpleInterest{
  public static void main(String[] args) {
    int principle = Integer.parseInt(args[0]);
    int rateOfInterest = Integer.parseInt(args[1]);
    int time = Integer.parseInt(args[2]);

    double si = (principle * time * rateOfInterest)/100.0;
    System.out.println("Simple interest is "+si);
  }
}