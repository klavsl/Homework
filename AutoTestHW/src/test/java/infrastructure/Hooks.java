package infrastructure;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{

    private DriverController controller;

    public Hooks(DriverController controller)
    {
        this.controller = controller;
    }

    @Before
    public void before()
    {
        controller.setupController();
    }

    @After
    public void after()
    {
        controller.teardownController();
    }
}
