package project;

import java.util.ArrayList;
import java.util.List;

public class Restraunt {
	private int rid;
	private String name;
	private String type;
	private List<Food> menu;

	
	public Restraunt(int rid, String name, String type) {
		this.rid = rid;
		this.name = name;
		this.type = type;
		this.menu = new ArrayList<>();
	}
	public int getRid() {
		return rid;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	
	public void addFood(Food food) {
        menu.add(food);
    }

    public List<Food> getMenu() {
        return menu;
    }
	@Override
	public String toString() {
		return "Restaurant-Id: " + rid + "\n" +
	           "Restaurant Name: " + name + "\n" +
	           "Type: " + type;
	}
	
	
}
