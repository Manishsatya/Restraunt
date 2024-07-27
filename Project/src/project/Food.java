package project;

public class Food {
	private int oid;
	private int rid;
	private String foodName;
	private int quantity;
	private boolean isAvailable;
	
	private static int count=1;
	
	public Food(int rid,String foodName, int quantity) {
		super();
		this.oid = count++;
		this.rid = rid;
		this.foodName = foodName;
		this.quantity = quantity;
		this.isAvailable = true;
	}

	public int getOid() {
		return oid;
	}

	public int getRid() {
		return rid;
	}
	
	public String getFoodName() {
		return foodName;
	}

	public int getQuantity() {
		return quantity;
	}
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Item"+ foodName + "-" + (isAvailable?"Available":"Not-Available");
	}
	

}
