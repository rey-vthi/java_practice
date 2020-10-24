public class ArrayUtils {

  public static void printList(int[] list) {

    System.out.println("Items are :");
    for(int number:list) {
      System.out.println(number);
    }
  }

  public static int[] range(int from, int to, int step) {
    int length = (to - from) / step + 1; 
    int[] list = new int[length];
    int currentNumber = from;

    for(int index = 0; index < length; index++) {
      list[index] = currentNumber;
      currentNumber += step;
    }

    return list;
  }

  public static int[] range(int from, int to) {
    return range(from, to, 1);
  }

  public static int[] repeat(int count, int number) {
    int[] list = new int[count];

    for(int index = 0; index < count; index++) {
      list[index] = number;
    }

    return list;
  }

  public static int largest(int[] list) {
    int largestNumber = list[0];

    for(int index = 1; index < list.length; index++) {
      if(largestNumber < list[index]) {
        largestNumber = list[index];
      }
    }

    return largestNumber;
  }

  public static int sum(int[] list) {
    int sum = 0;

    for (int number : list) {
      sum += number;
    }

    return sum;
  }

  public static double average(int[] list) {
    int sum = sum(list);

    return sum / (double)list.length;
  }

  public static boolean isInAscendingOrder(int[] list) {

    for(int index = 0; index < list.length - 1; index++) {

      if(list[index] >= list[index + 1]) {
        return false;
      }

    }

    return true;
  }

  public static boolean isEqual(char[] list1, char[] list2) {

    if(list1.length != list2.length) {
      return false;
    }

    for(int index = 0; index < list1.length; index++) {
      if(list1[index] != list2[index]) {
        return false;
      }
    }
    
    return true;
  }

  public static int[] concatList(int[] list1, int[] list2) {
    int length = list1.length + list2.length;
    int[] list = new int[length];

    for(int index = 0; index < length; index++) {

      if(index < list1.length) {
        list[index] = list1[index];
      } else {
        list[index] = list2[index - list1.length];
      }
      
    }
    
    return list;
  }

  public static int countNonZeroes(int[] list) {
    int count = 0;

    for(int index = 0; index < list.length; index++) {
      if(list[index] != 0) {
        count ++;
      }
    }

    return count;
  }

  public static int[] nonZeroes(int[] list) {
    int length = countNonZeroes(list);
    int[] result = new int[length];

    for(int index = 0,resultIndex = 0; index < list.length; index++) {
      if(list[index] != 0) {
        result[resultIndex] = list[index];
        resultIndex++;
      }
    }
    
    return result;
  }

  public static void main(String[] args) {

    int[] list = {1,2,3,4,5,0,0};
    int[] anotherList = {6,7,8,9,10};
    char[] name = {'r','e','v'};
    char[] id = {'r','e','y'};
    char[] fullName = {'r','e','v','a','t','h','i'};

    int[] concatenatedList = concatList(list,anotherList);

    printList(range(1,5));
    printList(range(1,5,2));
    printList(repeat(3,8));
    System.out.println("Largest number :"+ largest(list));
    System.out.println("Average :" + average(list));
    System.out.println("Is in Ascending order :" + isInAscendingOrder(list));
    System.out.println("char list comparison with different characters: " + isEqual(name,id));
    System.out.println("char list comparison with same characters: " + isEqual(name,name));
    System.out.println("char list comparison with different characters and length: " + isEqual(name,fullName));
    printList(concatenatedList);
    printList(nonZeroes(list));
  }
}