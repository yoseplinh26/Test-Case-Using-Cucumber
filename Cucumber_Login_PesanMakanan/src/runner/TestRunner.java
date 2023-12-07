package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="CekOtomotif", glue="stepDefinition")//Folder menyimpan feature file

public class TestRunner {

}
