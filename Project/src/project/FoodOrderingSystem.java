package project;
import java.util.*;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		
		PlaceOrder Rt = new PlaceOrder();
		
		Rt.addRestraunt(new Restraunt(201, "ABC", "Non-Veg"));
		Rt.addRestraunt(new Restraunt(202, "PQR", "Veg"));
		Rt.addRestraunt(new Restraunt(203, "XYZ", "Non-Veg"));
		Rt.addRestraunt(new Restraunt(204, "MNO", "Veg"));
		
		Rt.addToMenu(new Food(201, "Chicken Biryani", 10, 150));
        Rt.addToMenu(new Food(202, "Paneer Masala", 15, 200));
        Rt.addToMenu(new Food(203, "Mutton Biryani", 5, 250));
        Rt.addToMenu(new Food(204, "Veg Pulao", 20, 100));
		
		Scanner sc= new Scanner(System.in);
		
	
		while(true) {
			System.out.println("\nFood Ordering System");
			System.out.println("1. Search Restraunt");
			System.out.println("2. View Menu");
			System.out.println("3. Add Item to Cart");
			System.out.println("4. View Cart");
			System.out.println("5. Place Order");
			System.out.println("6. Admin - View all Orders");
			System.out.println("7. Admin - View all Restraunts");
			System.out.println("8. Exit");
			
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
				
			case 2:
				System.out.print("Enter Menu type (Non-Veg/Veg): ");
                type = sc.next();
                System.out.println("Menu:");
                Rt.displayMenu(type);
                break;
                
			case 3:
				System.out.print("Enter Restaurant ID: ");
                int rid = sc.nextInt();
                System.out.print("Enter Food Name: ");
                sc.nextLine(); 
                String foodName = sc.nextLine();
                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();
                boolean addedToCart = Rt.addToCart(rid, foodName, quantity);
                if (addedToCart) {
                    System.out.println("Item added to cart successfully!");
                } else {
                    System.out.println("Failed to add item to cart. Check availability and quantity.");
                }
                break;
                
			case 4:
				System.out.println("Cart:");
                Rt.displayCart();
                System.out.println("Total Price: " + Rt.getTotalPrice());
                break;
                
			case 5:
                Rt.placeOrder();
                System.out.println("Price: " + Rt.getTotalPrice());
                System.out.println("CGST: " + Rt.getTotalPrice()*18/100);
                System.out.println("SGST: " + Rt.getTotalPrice()*18/100);
                System.out.println("Total Price: " + (Rt.getTotalPrice()+(Rt.getTotalPrice()*18/100)*2));
                break;
                
			case 6:
                System.out.println("Admin - All Orders:");
                Rt.displayFood();
                break;

            case 7:
                System.out.println("Admin - All Restaurants:");
                Rt.displayRestraunts();
                break;

            case 8:
                System.out.println("Exiting...");

                return;

            default:
                System.out.println("Invalid Choice. Please try again.");
                break;
				
			}
			
		}
		
	}

}
