import java.io.IOException;
import java.util.*;
import java.util.UUID;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Cart {
	private List<CartItem> itemAddedInTheCart = new ArrayList<CartItem>();

	public Boolean addItemToCart(Item itemToBeAdded) {
		String uuid = UUID.randomUUID().toString();
		CartItem item = new CartItem(itemToBeAdded, uuid);
		this.itemAddedInTheCart.add(item);
		return true;
	}

	public String showItemInCart() throws JsonGenerationException, JsonMappingException, IOException {
		String allItem = "";
		for (CartItem i : this.itemAddedInTheCart) {

			String itemsInCartString = AppUtils.ConvertItemToJsonString(i);
			allItem = allItem.concat(itemsInCartString);

		}
		return allItem;

	}

	public int getNumberOfItemsInCart() {
		return this.itemAddedInTheCart.size();

	}

	public Boolean removeItemFromCart(String uuid) {
		System.out.println("Received uuid" + uuid);
		CartItem foundItem = this.searchByUUID(uuid);
		if (foundItem != null) {
			this.itemAddedInTheCart.remove(foundItem);
			return true;
		}
		return false;

	}

	private CartItem searchByUUID(String uuid) {
		for (CartItem c : this.itemAddedInTheCart) {
			if (c.uuid.indexOf(uuid.trim()) != -1) {
				return c;
			}
		}
		return null;

	}

}
