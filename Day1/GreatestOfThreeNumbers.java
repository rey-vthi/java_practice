public class GreatestOfThreeNumbers{

  public static int greater(int num1, int num2) {
    return num1 > num2 ? num1: num2;
  }

  public static int greatest(int num1, int num2, int num3) {
    return greater(greater(num1, num2), num3);
  }

  public static void main(String[] args) {

    if(args.length != 3) {
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    System.out.println("Greatest among them is " + greatest(num1, num2, num3));
    
  }
}