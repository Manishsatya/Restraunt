package project;
import java.util.*;

public class PlaceOrder {
	 private List<Restraunt> Res; 
	 private List<Food> Ord;
	 
	 public PlaceOrder() {
		 Res = new ArrayList<>();
		 Ord = new ArrayList<>();
		 
	 }
	 
	 public void addOrders(Food ord) {
	        Ord.add(ord);
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
			 
			 if(ord.getFoodName() == foodName && ord.isAvailable() && ord.getQuantity()> 0) {
				 return true;
		         	 
			 }
		 }
		 return false;
	 }
}
