public class Order {
  String item;
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(String itemName, boolean filled, double cost, String shippingMethod) {
		item = itemName;
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      double shippingCost = calculateShipping();
      System.out.println(item + "'s shipping cost: " + shippingCost);
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50; 
    }
    return shippingCost;
 	}
  
  public static void main(String[] args) {

    Order dumbbells = new Order("dumbbells", true, 25, "Express");
    Order pencils = new Order("pencils", false, 1.99, "Regular");
    Order notebook = new Order("notebook", true, 4, "Other");
    dumbbells.ship();
    //1.75
    pencils.ship();
    //not ready
    notebook.ship();
    //0.5
  }
}
