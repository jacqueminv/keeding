import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

    @Before
    public void setUp() {
	Fixtures.deleteAll();
    }

    @Test
    public void userCreationTest() {
	new User("test@gmail.com", "secretpass").save();

	User test = User.find("byUsername", "test@gmail.com").first();

	assertNotNull(test);
	assertEquals(test.username, "test@gmail.com");
	assertNotNull(User.exist("test@gmail.com"));
	assertNull(User.exist("test2@gmail.com"));	

    }

    @Test
    public void userSourcesTest() {
	Fixtures.load("data.yml");
	String bilboTwitter = "http://twitter.com/#!/bilbo";

	User test = User.find("byUsernameAndPassword",
			      "bilbo@gmail.com",
			      "secret").first();

	assertNotNull(test.accounts);
	assertTrue(test.accounts.size() == 1);
	assertTrue(test.accounts.get(0).url.equals(bilboTwitter));
    }

}
