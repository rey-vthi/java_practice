public class GcdAndLcm {

  public static int gcd(int firstNum, int secondNum) {
    int gcd = 1;
    int max = Math.max(firstNum, secondNum);
  
    for (int currentNum = 1; currentNum <= max; currentNum++) {
      if (firstNum % currentNum == 0 && secondNum % currentNum == 0) {
        gcd = currentNum;
      }      
    }      
    return gcd;
  }

  public static int lcm(int firstNum, int secondNum) {
    return (firstNum * secondNum) / gcd(firstNum, secondNum);
  }


  public static void main(String[] args){

    if(args.length != 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int firstNum = Integer.parseInt(args[0]);
    int secondNum = Integer.parseInt(args[1]);

    System.out.println("GCD of " + firstNum + " and " + secondNum + " is " + gcd(firstNum, secondNum));
    System.out.println("LCM of " + firstNum + " and " + secondNum + " is " + lcm(firstNum, secondNum));
  }
}