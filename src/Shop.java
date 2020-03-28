import java.io.IOException;
import java.util.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
public class Shop {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Hello");
//		Scanner s = new Scanner(System.in);
//		
//		
//
//		Item lux = new Item(new Price(10, "RS"), "lux", "good smell");
//		Item neemaRose = new Item(new Price(20, "RS"), "neemaRose", "bad smell");
//
//		Catalogue soap = new Catalogue();
//		Cart pujaCart = new Cart();
//		soap.addItemToCatalogue(lux);
//		try {
//			pujaCart.addItemToCart(lux);
//			pujaCart.addItemToCart(neemaRose);
//			System.out.println(pujaCart.showItemInCart());
//		} catch (Exception e) {
//			System.out.println("Unable to show item");
//			System.out.println(e);
//
//		}
//		System.out.println(pujaCart.getNumberOfItemsInCart());
//		System.out.println("Enter UUID item To be Removed");
//		String uuid= s.nextLine();
//		System.out.println("Received uuid" + uuid);
//		pujaCart.removeItemFromCart(uuid);
//		System.out.println(pujaCart.showItemInCart());
//		Catalogue sellerCatlogue = new Catalogue();
//		sellerCatlogue.addItemByUser();
//		sellerCatlogue.showAllItemToCatalogue();
		User puja = new User();
		Price p = new Price(12, "RS");
		Item soap = new Item(p, "lux", "good");
		puja.signUp();
		System.out.println(puja.getUserDetails());
		puja.addItemInUserCart(soap);
		
		System.out.println(AppUtils.ConvertOjectToJsonString(puja.userCart.showItemInCart()));
		
		
			
		
	}


}
