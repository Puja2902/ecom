import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Catalogue {
	public List<Item> allItemAvailable = new ArrayList<Item>();

	public void addItemToCatalogue(Item itemToAdd) {
		this.allItemAvailable.add(itemToAdd);
	}

	public void showAllItemToCatalogue() throws JsonGenerationException, JsonMappingException, IOException {
		for (Item i : this.allItemAvailable) {
			String currentItemString = AppUtils.ConvertOjectToJsonString(i);
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
		if (itemToRemove == null)
			return false;
		this.allItemAvailable.remove(itemToRemove);
		return true;
	}

	public void addItemByUser() {
		int ask = 1;
		while (ask == 1) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter item 's price, name and description separated by comma :");
			String userEnteredData = s.nextLine();
			String[] inputData = userEnteredData.split(",");
			int priceEnteredByUser = Integer.parseInt(inputData[0]);
			Price p = new Price(priceEnteredByUser, "RS. ");
			Item itemToAdd = new Item(p, inputData[1], inputData[2]);
			this.addItemToCatalogue(itemToAdd);
			System.out.println("Do you want to continue ? Enter Yes to add or no to skip ");
			String n = s.nextLine().toLowerCase();
			ask = n.indexOf("no") == -1 ? 1 : 0;

		}

	}
}
