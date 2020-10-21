public class Factorial{

  public static void main(String args[]) {
    int factorial = 1;
    int number = Integer.parseInt(args[0]);

    switch (args.length) {
      case 1:
        System.out.println("Your input is taken to find factorial");
        for(int i=1; i<=number; i++){
          factorial = factorial*i;
        }
        System.out.println("Factorial of " + number + " is " +factorial);
        break;
      
      default:
        System.out.println("Too many numbers, Please give a number");
        break;
    }

  }
}