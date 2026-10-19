package runner;


import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src/test/resources/features")
@ConfigurationParameters({
        @ConfigurationParameter(key= Constants.GLUE_PROPERTY_NAME, value="steps, shared"),
        @ConfigurationParameter(key= "cucumber.snippet-type", value ="camelcase")
})

// @ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@homepage")

public class TestRunner {

}
