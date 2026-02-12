public class Shopping {
  public static class cartItem{
    String itemName;
    double price;
    int quantity;
    public cartItem(String itemName,double price,int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public void AddCart(int quant){
        if(quant > 0){
          quantity += quant;
                  System.out.println(quantity + " " + itemName + " is added");
        }

    }
    public void removeCart(int quant){
      if(quant > 0 && quant <= quantity){
        quantity -= quant;
    System.out.println(quantity + " " + itemName + " is removed");


      }
    }
    public void display(){
              System.out.println("Now your Cart will be : ");
              System.out.println(itemName + "--->" + price);
              System.out.println("Total Bill is : " + (quantity * price));
              System.out.println("========================");

    }
    public static void main(String args[]){
        cartItem c1 = new cartItem("Water Bottle" , 500 , 1);
        c1.display();
        c1.AddCart(5);
        c1.display();
        c1.removeCart(3);
        c1.display();

    }
  }
}
