package com.classes;
import org.testng.log4testng.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class OrderListener {
    private static final Logger LOG = Logger.getLogger(OrderListener.class);

    @Before
    public void beforeScenario(Scenario scenario) {
        LOG.info("Starting scenario: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            LOG.error("Scenario failed: " + scenario.getName());
        } else {
            LOG.info("Scenario passed: " + scenario.getName());
        }
    }
}
