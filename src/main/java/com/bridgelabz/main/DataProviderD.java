package com.bridgelabz.main;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderD{
@DataProvider(name = "dataProvider")
public static Object [][] getDataForTestExecution(Method m) {
    if (m.getName().equalsIgnoreCase("WebinarScreen")) {
        return new Object[][]{
                {"7896573322", "sam@gmail.com", "sam"},
                {"7898373323", "yash@gmail.com", "yash"},
                {"7855573311", "sara@gmail.com", "sara"}
        };
    } else {
        return new Object[][]{
                {"7896573322"},
                {"7898373323"},
                {"7855573311"}
            };
        }
    }
}
