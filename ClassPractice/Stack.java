public class Stack {
  public int[] stack;
  public int top = 0;

  public Stack(int length) {
    stack = new int[length];
  }

  public void push(int number) {
    top++;
    stack[top] = number;
  }

  public int pop() {
    int number = stack[top];
    top--;
    return number;
  }

  public static void main(String[] args) {
    Stack stk = new Stack(5);
    stk.push(1);
    System.out.println(stk.pop());
  }
} 