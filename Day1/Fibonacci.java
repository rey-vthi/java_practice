public class Fibonacci {
  public static void main(String[] args) {
  int count = Integer.parseInt(args[0]);
    int currentNo = 0;
    int nextNum = 1;

    for(int i = 1; i <= count; i++){
      System.out.println(currentNo);
      nextNum = currentNo + nextNum;;
      currentNo = nextNum - currentNo;
    }
  }
}