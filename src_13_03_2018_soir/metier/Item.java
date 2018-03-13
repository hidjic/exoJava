package metier;

/**
 * @author Stéphane
 * La class item défini un objet utilisé par le héro
 *
 */
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
	
	public Item(String name) {
		this();
		this.setId(654);
		this.setName(name);
		this.setDescription("Ne sert a rien...");
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
	
	
	
	public String toString() {
		return "id = "+getId()+", nom = "+getName()+", description = "+getDescription();
	}
	
}
