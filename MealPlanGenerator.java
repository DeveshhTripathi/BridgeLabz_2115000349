import java.util.*;
interface MealPlan{
    String getMealName();
}
class VegetarianMeal implements MealPlan{
    private String mealName;

    public VegetarianMeal(String mealName){
        this.mealName = mealName;
 }
    public String getMealName(){
        return mealName;
  }
    public String toString(){
        return "Vegetarian Meal: " + mealName;
  }
}
class VeganMeal implements MealPlan{
    private String mealName;
    public VeganMeal(String mealName){
        this.mealName = mealName;
 }
    public String getMealName(){
        return mealName;
  }
    public String toString(){
        return "Vegan Meal: " + mealName;
  }
}
class KetoMeal implements MealPlan{
    private String mealName;
    public KetoMeal(String mealName){
        this.mealName = mealName;
  }
    public String getMealName(){
        return mealName;
  }
    public String toString(){
        return "Keto Meal: " + mealName;
  }
}
class HighProteinMeal implements MealPlan{
    private String mealName;

    public HighProteinMeal(String mealName){
        this.mealName = mealName;
    }
    public String getMealName(){
        return mealName;
  }
    public String toString(){
        return "High-Protein Meal: " + mealName;
  }
}
class Meal<T extends MealPlan>{
    private List<T> meals = new ArrayList<>();
    public void addMeal(T meal){
        meals.add(meal);
  }
    public List<T> getMeals(){
        return meals;
  }
}
class MealPlanUtility{
    public static <T extends MealPlan> void generateMealPlan(T meal){
        System.out.println("Generated Meal Plan: " + meal);
 }
}
public class MealPlanGenerator{
    public static void main(String[] args){
        VegetarianMeal vegMeal = new VegetarianMeal("Paneer");
        VeganMeal veganMeal = new VeganMeal("Tofu Stir-Fry");
        KetoMeal ketoMeal = new KetoMeal("Avocado & Egg Bowl");
        HighProteinMeal proteinMeal = new HighProteinMeal("Chicken");
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(vegMeal);
        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(veganMeal);
        Meal<KetoMeal> ketoPlan = new Meal<>();
	ketoPlan.addMeal(ketoMeal);
        Meal<HighProteinMeal> highProteinPlan = new Meal<>();
        highProteinPlan.addMeal(proteinMeal);
        System.out.println("\nGenerated Meal Plans:");
        MealPlanUtility.generateMealPlan(vegMeal);
        MealPlanUtility.generateMealPlan(veganMeal);
        MealPlanUtility.generateMealPlan(ketoMeal);
        MealPlanUtility.generateMealPlan(proteinMeal);
  }
}
