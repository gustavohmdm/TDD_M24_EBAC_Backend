import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author gustavohmdm
 */

@RunWith(Suite.class)
@SuiteClasses({ ClienteServiceTest.class, ContratoServiceTest.class })
public class AllTests {
}
