import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by clovisolivier on 03/01/2017.
 */
public class HomePageTest extends FunctionalTest {


    @Test
    public void showCatalogs(){

        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.isInitialized());

    }


}
