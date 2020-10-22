public class CentigrageToFahrenheit{
  public static void main(String[] args) {
    int centigrade = Integer.parseInt(args[0]);
    double fahrenheit = ((centigrade * 9) / 5.0) + 32;

    System.out.println(centigrade + "c is equal to " + fahrenheit + "f");
  }
}