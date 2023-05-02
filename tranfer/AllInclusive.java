import java.util.*;
public class AllInclusive extends Vacation
{

	protected String brand = "";
	protected int rating;
	protected int price;
  
   public AllInclusive(int budget, String destination, String brand, int rating, int price)
   {
      super(budget, destination);
      budget = budget - this.budget - price;
      this.brand = brand;
      this.rating = rating;
      this.price = price;
   }

   public void displays()
   {
      if(budget > 0)
      {
         System.out.print("the vacation was under budget by " + budget);
      }
      if(budget < 0)
      {
         System.out.print("the vacation was over under budget by " + budget);
      }
      else
      {
         System.out.print("the budget was used to the las cent");
      }
      System.out.println("The brand is " + brand+ " with a rating of " + rating + " stars\t the price is " +price+ " at " + destination);
   }
}