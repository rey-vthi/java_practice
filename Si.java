public class Si{
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);
    int t = Integer.parseInt(args[2]);

    double si = (p * t * r)/100.0;
    System.out.println(si);
  }
}