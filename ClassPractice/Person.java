public class Person {
  public String name;
  public int age;
  public String occupation;

  public Person(String name, int age, String occupation) {
    this.name = name;
    this.age = age;
    this.occupation = occupation;
  }

  public String toString() {
    return "Person { name: " + this.name + ", age: " + this.age + ", occupation: " + this.occupation +" }";     
  }

  public boolean isEligibleToVote() {
    return this.age > 18;
  }

  public void updateOccupation(String newOccupation) {
    this.occupation = newOccupation;
  }

  public static void main(String[] args) {
    Person p = new Person("Revathi",20,"student");
    p.updateOccupation("employee");
    System.out.println(p.toString());
  }
}