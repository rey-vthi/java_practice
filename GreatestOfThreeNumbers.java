public class GreatestOfThreeNumbers{
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);

    int greatest = num1 > num2? num1:num2;
    greatest = greatest>num3?greatest:num3;

    System.out.println("Greatest among them is " + greatest);
    
  }
}