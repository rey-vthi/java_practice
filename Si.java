public class Si{
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    int t = Integer.parseInt(args[1]);
    int r = Integer.parseInt(args[2]);

    float si = (p * t * r)/100f;
    System.out.println(si);
  }
}