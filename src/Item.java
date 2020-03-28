
public class Item {

	private Price price = null;
	public String name = null;
	public String description = null;

	public Item(Price daam, String naam, String uskeBaareMai) {
		this.price = daam;
		this.name = naam;
		this.description = uskeBaareMai;
	}

	public String getPrice() {
		return this.price.getPrice();
	}
}
