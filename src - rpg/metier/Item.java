package metier;

public class Item {
	private int id;
	private String name;
	private int buyPrice;
	private int sellPrice;
	private String description;
	
	
	// constructor
	public Item() {
		super();
		this.setId(321);
		this.setName("Potion de vie");
		this.setBuyPrice(2);
		this.setSellPrice(1);
		this.setDescription("Vous récupérez tout vos point de vie.");
	}
	
	
	// getter / setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
