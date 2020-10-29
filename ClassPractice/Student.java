public class Student {
  public String name;
  public int standard;
  public int maths = 0;
  public int science = 0;
  public int social = 0;

  public Student( String name, int standard, int maths, int science, int social) {
    this.name = name;
    this.standard = standard;
    this.maths = maths;
    this.science = science;
    this.social = social;
  }

  public int getTotal() {
    return this.maths + this.science + this.social;
  }

  public double getAverage() {
    return getTotal() / 3 ;
  }

  public String info() {
    return this.name + " is studying in " + this.standard + " standard";
  }

  public void updateMathMarks(int mark) {
    this.maths = mark;
  }

  public void updateScienceMarks(int mark) {
    this.science = mark;
  }

  public void updateSocialMarks(int mark) {
    this.social = mark;
  }

  public String getResult() {
    String result = (getTotal() > 104) ? "Pass" : "Fail";
    return result;
  }

  public static void main(String[] args) {
    Student student = new Student("Revathi", 10, 50, 50, 50);
    System.out.println(student.info());
    System.out.println("Total marks: " + student.getTotal());
    System.out.println("Average: " + student.getAverage());
    student.updateMathMarks(51);
    System.out.println("Total after updation of marks: " + student.getTotal());
    System.out.println("Result :" + student.getResult());
  }
}