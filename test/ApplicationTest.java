import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset("utf-8", response);
    }

    @Test
    public void testHomeScreen() {
	Fixtures.load("data.yml");
	this.login("bilbo@gmail.com", "secret");
    }

    private void login(String username, String password){
	String params = "username="+username+"&password="+password;
	try {
	    params = URLEncoder.encode(params, "UTF-8");
	} catch (UnsupportedEncodingException e) {
	    //pass
	    System.out.println(e);	    
	    throw new RuntimeException(e);
	}

	
	Response response = POST("/login", "application/x-www-form-urlencoded", params);

    }
}