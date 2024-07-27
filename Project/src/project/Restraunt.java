package project;

public class Restraunt {
	private int rid;
	private String name;
	private String type;

	
	public Restraunt(int rid, String name, String type) {
		this.rid = rid;
		this.name = name;
		this.type = type;
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
	@Override
	public String toString() {
		return "Restraunt [rid=" + rid + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
