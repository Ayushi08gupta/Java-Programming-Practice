public class TrackItem {
  public static class Item{
    String[] itemCode;
    String[] itemName;
    double[] price;
    public Item(String[] code , String[] name , double[] price){
      this.itemCode = code;
      this.itemName = name;
      this.price = price;
    }
    public void display(){
      for(int i = 0 ; i < price.length ; i++){
         System.out.println("Item Code : " + itemCode[i]);
      System.out.println("Item Name : " + itemName[i]);
      System.out.println("Item Price : " + price[i]);
      System.out.println("=========================");
      }
    }
    public static void main(String args[]){
      String code[] = {"11A" , "11B" , "12B"};
      String name[] = {"Lunch Box" , "Water Bottle" , "Bag"};
      double price[] = {500 , 500, 5000};
      Item I1 = new Item(code, name, price);
      I1.display();
      int totalPrice = 0;
      for(int i =0 ; i < price.length ; i++){
          totalPrice += price[i];
      }
      System.out.println("Total Price is : " + totalPrice);
    }
  
  }
}
