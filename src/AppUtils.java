import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class AppUtils {
	public static String ConvertItemToJsonString(Item i) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(i);
		return json;
	}
	
	public static String ConvertItemToJsonString(CartItem i) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(i);
		return json;
	}
	
	
	

}
