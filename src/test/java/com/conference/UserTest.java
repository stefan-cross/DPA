package test.java.com.conference;

import junit.framework.TestCase;
import main.java.com.conference.User;
import org.junit.Assert;

public class UserTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testUserSingletonGetInstance() {
        User user = User.getInstance();
        Assert.assertEquals(user, User.getInstance());
    }

    public void tearDown() throws Exception {

    }
}