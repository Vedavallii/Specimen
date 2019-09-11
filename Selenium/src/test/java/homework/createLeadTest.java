package homework;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class createLeadTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }

  @Test
  public void readDataTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void runcreateLeadTest() {
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void sendDataTest() {
    throw new RuntimeException("Test not implemented");
  }
}
