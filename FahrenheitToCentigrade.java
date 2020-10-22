public class FahrenheitToCentigrade {
  public static void main(String[] args) {
    int fahrenheit = Integer.parseInt(args[0]);
    double centigrade = ((fahrenheit-32) * 5) / 9.0;

    System.out.println(fahrenheit + "f is equal to " + centigrade + "c");
  }
}