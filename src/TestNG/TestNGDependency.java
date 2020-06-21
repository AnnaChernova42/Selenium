package TestNG;


import org.testng.annotations.*;

public class TestNGDependency {
	
	  @Test(dependsOnMethods = {"B"})
	  public void A() {
	  }
	  @Test //(dependsOnGroups = "B")
	  public void B() {
	  }
	  @Test ()
	  public void C() {
	  }



}
