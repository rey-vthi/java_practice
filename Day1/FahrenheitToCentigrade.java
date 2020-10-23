public class FahrenheitToCentigrade {

  public static double convertToCentigrade(int fahrenheit) {
    return ((fahrenheit - 32) * 5) / 9.0;
  }

  public static void main(String[] args) {
    if(args.length != 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int fahrenheit = Integer.parseInt(args[0]);

    System.out.println(fahrenheit + "f is equal to " + convertToCentigrade(fahrenheit) + "c");
  }
}