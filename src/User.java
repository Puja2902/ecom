import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class User {

	UserDetail userDetail;
	Cart userCart = new Cart();

	public void signUp() {
		String name = AppUtils.getUserInputString("Please enter your name : ");
		long mobileNumber = AppUtils.getUserInputInteger("Please enter your mobile number : ");
		String emailId = AppUtils.getUserInputString("Please enter your email id : ");
		String password = AppUtils.getUserInputString("Please choose a password : ");
		this.userDetail = new UserDetail(name, mobileNumber, emailId, password);
	}

	public Boolean login() {
		String enteredEmail = AppUtils.getUserInputString("Enter your email id : ");
		String enteredPwd = AppUtils.getUserInputString("Enter your password : ");
		if (this.userDetail.emailId == enteredEmail && this.userDetail.password == enteredPwd) {
			return true;
		}
		return false;

	}

	public String getUserDetails() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(this.userDetail);
		return json;

	}
	public Cart addItemInUserCart(Item i) {
		this.userCart.addItemToCart(i);
		return this.userCart;
	}
	
	

}
