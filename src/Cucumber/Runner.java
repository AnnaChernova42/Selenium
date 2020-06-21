package Cucumber;

public class Runner {
	@RunWith(Cucumber.class)
	@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@smokeTest")
	public class CucumberRunner {
	}
}
