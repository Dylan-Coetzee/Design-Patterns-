/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import ObserverPattern.WeatherCustomer1;
import ObserverPattern.WeatherCustomer2;
import ObserverPattern.WeatherStation;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Dylan
 */
public class ObserverPatternTest {
    
    public ObserverPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void ObserveTest() {
         WeatherStation ws = new WeatherStation(65);
         WeatherCustomer1 w1 = new WeatherCustomer1();
         WeatherCustomer2 w2 = new WeatherCustomer2();
         ws.addObserver(w1);
         ws.addObserver(w2);
         ws.setTempreature(64);
         Assert.assertEquals(ws.getTempreature(), 64);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
