public class CompoundInterest{
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    double r = Integer.parseInt(args[1])/100.0;
    int t = Integer.parseInt(args[2]);
    
    double a = p;
    double ci;

    for(int i=t; t>0; t--) {
      a = a *(1+r);
    }
    
    ci = a-p;
    System.out.println(ci);
  }
}