import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import javax.swing.JTextField;



/**
 * Test class for stud_signUp
 */
public class stud_signUpTest {

    private stud_signUp instance;

    public stud_signUpTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting stud_signUp tests");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finished stud_signUp tests");
    }

    @Before
    public void setUp() {
        instance = new stud_signUp();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    
    






    @Test
    
public void testIsNameValid() {
    System.out.println("Testing isNameValid method");
    assertTrue(instance.isNameValid("Kiruba"));  // Valid name
         // Null name should return false
}

    @Test
    public void testIsAgeValid() {
        System.out.println("Testing isAgeValid method");
        assertTrue(instance.isAgeValid("10"));   // Valid age
        
    }

    @Test
    public void testIsStandardValid() {
        System.out.println("Testing isStandardValid method");
        assertTrue(instance.isStandardValid("3"));
        
    }

    @Test
    public void testIsEmailValid() {
        System.out.println("Testing isEmailValid method");
        assertTrue(instance.isEmailValid("john@example.com"));
        
    }

    @Test
    public void testIsPasswordValid() {
        System.out.println("Testing isPasswordValid method");
        assertTrue(instance.isPasswordValid("password123"));
        
    }

    @Test
    public void testMain() {
        System.out.println("Testing main method");
        String[] args = null;
        stud_signUp.main(args);
        // No assertions needed for main, just confirming it runs without errors
    }
}
