public class CentigradeToFahrenheit {

  public static double convertToFahrenheit(int centigrade) {
    return ((centigrade * 9) / 5.0) + 32;
  }

  public static void main(String[] args) {

    if(args.length != 1) {
      System.out.println("Insufficient arguments");
      return;
    }

    int centigrade = Integer.parseInt(args[0]);

    System.out.println(centigrade + "c is equal to " + convertToFahrenheit(centigrade) + "f");
  }
}