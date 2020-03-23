import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Catalogue {
	public List<Item> allItemAvailable = new ArrayList<Item>();

	public void addItemToCatalogue(Item itemToAdd) {
		this.allItemAvailable.add(itemToAdd);
	}

	public void showAllItemToCatalogue() throws JsonGenerationException, JsonMappingException, IOException {
		for (Item i : this.allItemAvailable) {
			String currentItemString = AppUtils.ConvertItemToJsonString(i);
			System.out.println(currentItemString);
		}
	}

	public Item searchItemByName(String name) {

		for (Item i : this.allItemAvailable) {
			if (i.name == name) {
				return i;
			}
		}
		return null;

	}
	public Boolean removeItem(String nameOfItemToRemove) {
		Item itemToRemove = this.searchItemByName(nameOfItemToRemove);
		if(itemToRemove==null) return false;
		this.allItemAvailable.remove(itemToRemove);
		return true;
	}
	
	
	
	
	
	
	
	
	

}
