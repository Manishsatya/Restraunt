package project;
import java.util.*;

public class PlaceOrder {
	 private List<Restraunt> Res; 
	 private List<Food> Ord;
	 
	 public PlaceOrder() {
		 Res = new ArrayList<>();
		 Ord = new ArrayList<>();
		 
	 }
	 
	 public void addRestraunt(Restraunt res) {
	        Res.add(res);
	    }
	 
	 public void addToMenu(Food food) {
		 for(Restraunt res : Res) {
			 if(res.getRid() == food.getRid()) {
				 res.addFood(food);
				 return;
			 }
		 }
	 }
	 public List<Restraunt> searchRestraunts(String type){
		 List<Restraunt> availableRestraunts = new ArrayList<>();
		 for(Restraunt res:Res) {
			 if(res.getType().equalsIgnoreCase(type)){
				 availableRestraunts.add(res);
			 }
		 }
		 return availableRestraunts;
	 }
	 
	 public boolean addToCart(int rid, String foodName, int quantity) {
		 for(Restraunt res : Res) {
			 if(res.getRid() == rid) {
				 for(Food food : res.getMenu()) {
					 if(food.getFoodName().equalsIgnoreCase(foodName) && food.isAvailable() && food.getQuantity() >= quantity) {
						 food.setQuantity(food.getQuantity() - quantity);
						 Ord.add(new Food(rid,foodName,quantity, food.getPrice()*quantity));
						 return true;
					 }
				 }
			 }
		 }
		 return false;
	 }


	 public void placeOrder() {
	        if (Ord.isEmpty()) {
	            System.out.println("Cart is empty. Please add items to the cart before placing an order.");
	        } else {
	            System.out.println("Order placed successfully!");
	            for (Food food : Ord) {
		            System.out.println(food);
	            }
	            
	        }
	    }
	 
	 public double getTotalPrice() {
	        double total = 0;
	        for (Food food : Ord) {
	            total += food.getPrice();
	        }
	        return total;
	    }

	    public void displayCart() {
	        for (Food food : Ord) {
	            System.out.println(food);
	        }
	    }
	 
	 public void displayRestraunts() {
		 for(Restraunt res:Res) {
			 System.out.println(res);
		 }
	 }
	 
	 public void displayMenu(String type) {
	        List<Restraunt> selectedRestraunts = searchRestraunts(type);
	        for (Restraunt res : selectedRestraunts) {
	            System.out.println(res);
	            for (Food food : res.getMenu()) {
	                System.out.println(food);
	            }
	        }
	    }
	 
	 public void displayFood() {
		 for(Food ord:Ord) {
			 System.out.println(ord);
		 }
	 }
}
