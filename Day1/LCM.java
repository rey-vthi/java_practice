public class LeastCommonMultiple{
  public static void main(String[] args){
    int GCD=0;
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int num=num1>num2?num2:num1;

    while(GCD==0 && num>0){
      if((num1%num)==(num2%num)){
        GCD=num;
      }
      num--;
    }

    int LCM=(Math.abs(num1*num2))/GCD;
    
    System.out.println(LCM);
  }
}