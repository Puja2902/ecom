
public class Price {

	public int value = 0;
	public String currency = null;
	
	public Price(int daam , String kaam) {
		this.value = daam;
		this.currency = kaam;
	}
	public String getPrice() {
		return this.currency + " " + this.value;
	}	
	
}
