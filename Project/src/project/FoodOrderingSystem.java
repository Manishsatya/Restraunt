package project;
import java.util.*;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		
		PlaceOrder Rt = new PlaceOrder();
		
		Rt.addRestraunt(new Restraunt(201, "ABC", "Non-Veg"));
		Rt.addRestraunt(new Restraunt(202, "PQR", "Veg"));
		Rt.addRestraunt(new Restraunt(203, "XYZ", "Non-Veg"));
		Rt.addRestraunt(new Restraunt(204, "MNO", "Veg"));
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("\nFood Ordering System");
			System.out.println("1. Search Restraunt");
			System.out.println("2. Select Food");
			System.out.println("3. Place Order");
			System.out.println("4. View my Orders");
			System.out.println("5. Admin - View all Orders");
			System.out.println("6. Admin - View all Restraunts");
			System.out.println("7. Exit");
			
			System.out.println("Enter Your Choice: ");
			int option = sc.nextInt();
			
			switch (option) {
			
			case 1:
				System.out.println("Enter Food type (Non-Veg/Veg)");
				
				String type = sc.next();
				List<Restraunt> availableRestraunts = Rt.searchRestraunts(type);
				if (availableRestraunts.isEmpty()) {
                    System.out.println("No Food Items available.");
                } 
				else {
                    System.out.println("Available Restraunts:");
                    for (Restraunt res : availableRestraunts) {
                        System.out.println(res);
                    }
                }
				break;
				
			}
		}
		
	}

}
