package com.mypackage.steps;

import com.mypackage.core.AppiumBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;


//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;

import java.net.MalformedURLException;

public class ServiceHooks {
    AppiumBase appiumBase = new AppiumBase();
    @Before
    public void initTest() throws MalformedURLException {
        appiumBase.crateDriver();
    }

    @After
    public void afterHooks(){
        appiumBase.teaDown();
    }
}
