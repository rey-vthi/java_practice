public class SimpleInterest{
  public static void main(String[] args) {
    int principal = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    
    double simpleInterest=(principal*rate*period)/100;
    
    System.out.println(simpleInterest);
  }
}