public class GcdAndLcm{
  public static void main(String[] args) {
    int gcd=1;
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    for(int i=2; i<=num1 && i<=num2; i++) {
      if(num1%i==0 && num2%i==0) {
        gcd = i;
      }
    }

    int lcm = (num1 * num2) / gcd;
    System.out.println("LCM of "+ num1 + num2+ " is " + lcm);
    System.out.println("GCD of "+ num1 + num2+ " is " + gcd);
  }
}