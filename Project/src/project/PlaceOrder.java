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
	 
	 public List<Restraunt> searchRestraunts(String type){
		 List<Restraunt> availableRestraunts = new ArrayList<>();
		 for(Restraunt res:Res) {
			 if(res.getType().equalsIgnoreCase(type)){
				 availableRestraunts.add(res);
			 }
		 }
		 return availableRestraunts;
	 }

	 public List<Food> getItems(String foodName){
		 List<Food> items = new ArrayList<>();
		 for(Food ord:Ord) {
			 if(ord.getFoodName().equalsIgnoreCase(foodName)) {
				 items.add(ord);
			 }
		 }
		 return items;
	 }
	 
	 public boolean placeOrder(int rid,String foodName, int quantity) {
		 for(Food ord:Ord) {
			 
			 if(ord.getFoodName().equals(foodName) && ord.isAvailable() && ord.getQuantity()> 0) {
				 Ord.add(new Food(rid,foodName,quantity));
				 return true;
		         	 
			 }
		 }
		 return false;
	 }
	 
	 public void displayRestraunts() {
		 for(Restraunt res:Res) {
			 System.out.println(res);
		 }
	 }
	 
	 public void displayFood() {
		 for(Food ord:Ord) {
			 System.out.println(ord);
		 }
	 }
}
