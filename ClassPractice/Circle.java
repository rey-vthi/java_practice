public class Circle {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return (3.14 * this.radius * this.radius);
  }

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println(circle.area());
  }
}