package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks {
@Before
public void beforeScenerio(Scenario sc)
{
	System.out.println(sc.getName());
	System.out.println(sc.getId());
}
@After
public void afterScenerio(Scenario sc)
{
	System.out.println(sc.getStatus());
}
}
