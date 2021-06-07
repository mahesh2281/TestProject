package webautoexercise;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {
    @Before
    public void UISetup(){
        new TestBase().TestSetup();
    }

    @After
    public void UITeardown(){
        new TestBase().TestTearDown();
    }
}
