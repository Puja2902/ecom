import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class AppUtils {
	

	public static String ConvertOjectToJsonString(Object i)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(i);
		return json;
	}

	public static String ConvertItemToJsonString(CartItem i)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(i);
		return json;
	}

	public static long getUserInputInteger(String messageToDisplay) {

		System.out.println(messageToDisplay);
		Scanner s = new Scanner(System.in);
		long userInput = s.nextLong();
		return userInput;
	}

	public static String getUserInputString(String messageToDisplay) {
		System.out.println(messageToDisplay);
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		return userInput;

	}

}
