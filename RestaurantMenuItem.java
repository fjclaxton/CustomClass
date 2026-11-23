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
   //default values
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
   //constructor for name + ingredients + price
   //helps support the option to have the most simple menu generated. the course will default to entree because 
   //on a menu only see the name, ingredients and price.
   public RestaurantMenuItem(String name, ArrayList<String> ingredients, int price) {
      this.name = name;
      this.ingredients = ingredients;
      this.retailPrice = price;
      
   }
   //all values passed
   public RestaurantMenuItem(String name, String course, int timeToPrepare, double productionCost, double retailPrice) {
      this.name = name;
      this.course = course;
      ingredients = new ArrayList<String>();
      this.timeToPrepare = timeToPrepare;
      this.productionCost = productionCost;
      this.retailPrice = retailPrice;
   }
   
   //methods
   //adds ingredient to ingredient list
   public void addIngredient(String i, int cost) {
      ingredients.add(i);
      productionCost += cost;
      retailPrice += (cost * 1.5);
      System.out.println(ingredients);
   }
   //removes ingredient from ingredient list
   public void removeIngredient(String remove, int cost) {
      ingredients.remove(remove);
      productionCost -= cost;
      retailPrice -= (cost * 1.5);
      System.out.println(ingredients);
   }
   //increase retail cost
   public void increaseCost(double newCost) {
      retailPrice += newCost;
      System.out.println(retailPrice);
   }
   //get the cost of item
   public double getCost(){
      return retailPrice;
   }
   //get the cost margin percent
   public String costMarginPercent() {
      return ((productionCost/retailPrice) * 100) + "%";
   }
   //change the name and course of the item
   public void changeNameAndCourse(String newName, String newCourse) {
      name = newName;
      course = newCourse;
   }
   
}