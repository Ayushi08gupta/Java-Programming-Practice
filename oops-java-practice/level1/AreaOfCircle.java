public class AreaOfCircle{
  double radius;
  public AreaOfCircle(double radius){
      this.radius = radius;
  }
  public void area(){
    double area = 3.14 * radius * radius;
    System.out.println("Area of Circle is : " + area);
  }
  public  void circumference(){
      double circumference = 2 * 3.14 * radius;
    System.out.println("circumference of Circle is : " + circumference);
  }
  public static void main(String args[]){
    AreaOfCircle c1 = new AreaOfCircle(5.7);
    c1.area();
    c1.circumference();
  }
}