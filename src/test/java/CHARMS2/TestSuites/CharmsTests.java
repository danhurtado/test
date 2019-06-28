package CHARMS2.TestSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import pom.TestsCases.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({NewUser_Test.class, Login_Test.class, NewInventoryItem_Test.class})

public class CharmsTests {

}
