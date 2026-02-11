public class HandleMobilePhoneDetails {
  public static class MobilePhone{
    String Brand ;
    String Model;
    double Price;
    public MobilePhone(String Brand , String Model , double Price){
      this.Brand = Brand;
      this.Model = Model;
      this.Price = Price;
    }
    public void display(){
      System.out.println("Brand Of Mobile is : " + Brand);
     System.out.println("Model Of Mobile is : " + Model);
      System.out.println("Price Of Mobile is : " + Price);
      System.out.println("============================");
    }
    public static void main(String[] args) {
      MobilePhone m1 = new MobilePhone("Samsung", "Samsung Galaxy S25 Ultra 5G", 118999);
      MobilePhone m2 = new MobilePhone("Apple", "Apple iPhone 16", 69900);
      MobilePhone m3 = new MobilePhone("OnePlus", "OnePlus 15R", 47428);
      m1.display();
      m2.display();
      m3.display();
    }
  }
}
