public class CompoundInterest{
  public static void main(String[] args) {
    int principal = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);

    double compoundInterest = ((principal *( (1 + rate) ** period)) - principal);
    
    System.out.println(compoundInterest);
  }
}