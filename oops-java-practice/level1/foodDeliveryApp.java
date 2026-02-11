import java.util.Scanner;
public class foodDeliveryApp {
  public static class Resturant{
    String name ;
    String location;
    String[] foodItems;
    public Resturant(String name , String location , String[] foodItems){
      this.name = name;
      this.location = location;
      this.foodItems = foodItems;
    }
  public void DisplayDetails(){
        System.out.println("Name of Resturant : " + name);
    System.out.println("Location of Resturant : " + location);
    System.out.println("Food Items present : "  );
   for(String food : foodItems){
      System.out.print(food + " ");
   }
  
  }
  public boolean isAvailable(String foodItem){
    for(String food : foodItems){
          if(foodItem.equalsIgnoreCase(food))
          return true;
    }
    return false;
  }
  public static void main(String[] args) {
    String foodItem1[] = {"Pasta" , "Manchurian" , "Momos" ,"Dosa" , "Idli"};
    String foodItem2[] = {"Paneer" , "Daal Tadka" , "Fries" , "Rasugulla" , "Gajar ka Halwa"};
    String foodItem3[] = {"Pizza" , "Burger"};
    Resturant r1 = new Resturant("Kapoor's Cafe", "Indrapuri sector C Bhopal", foodItem1);
    Resturant r2 = new Resturant("Royals Town", "near bus Stand Bhopal", foodItem2);
    Resturant r3 = new Resturant("Dominos", "Near town hall Bhopal", foodItem3);
    System.out.println("==================== Resturant 1 ======================");
    r1.DisplayDetails();
    System.out.println();
    System.out.println("==================== Resturant 2 ======================");
    r2.DisplayDetails();
     System.out.println();
    System.out.println("==================== Resturant 3 ======================");
    r3.DisplayDetails();
    System.out.println();
    Scanner sc = new Scanner(System.in);
System.out.println("Enter food you want : ");
    String food = sc.next();
    if(r1.isAvailable(food)==true || r2.isAvailable(food)==true || r3.isAvailable(food)==true ) {
      System.out.println("Yes " + food + " is Available");
    }
    else{
            System.out.println("Sorry " + food + " is not Available");

    }
  }

}
}