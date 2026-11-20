import java.util.ArrayList;
public class RestaurantMenuItem {
   
   //instance vars
   private String name;
   private String course;
   private ArrayList<String> ingredients;
   private int timeToPrepare;
   private double productionCost;
   private double retailPrice;
   
   //constructors
   public RestaurantMenuItem() {
      name = "Cheese Burger";
      course = "Entree";
      ingredients = new ArrayList<String>();
      ingredients.add("Bread");
      ingredients.add("Cheese");
      ingredients.add("Pattie");
      ingredients.add("Pickles");
      ingredients.add("BBQ Sauce");
      timeToPrepare = 6;
      productionCost = 4.00;
      retailPrice = 9.99;
   }
   public RestaurantMenuItem(String name, String course, int timeToPrepare, double productionCost, double retailPrice) {
      this.name = name;
      this.course = course;
      ingredients = new ArrayList<String>();
      this.timeToPrepare = timeToPrepare;
      this.productionCost = productionCost;
      this.retailPrice = retailPrice;
   }
   
   //methods
   public void addIngredient(String i, int cost) {
      ingredients.add(i);
      productionCost += cost;
      retailPrice += (cost * 1.5);
      System.out.println(ingredients);
   }
   public void increaseCost(double newCost) {
      retailPrice += newCost;
      System.out.println(retailPrice);
   }
   public double getCost(){
      return retailPrice;
   }
   public String costMarginPercent() {
      return ((productionCost/retailPrice) * 100) + "%";
   }
   public void changeNameAndCourse(String newName, String newCourse) {
      name = newName;
      course = newCourse;
   }
   public void removeIngredient(String remove) {
      ingredients.remove(remove);
   }
}