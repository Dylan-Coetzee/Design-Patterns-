/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import BridgePattern.BigBus;
import BridgePattern.BigEngine;
import BridgePattern.SmallEngine;
import BridgePattern.Vehicle;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Dylan
 */
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestBridge() {
         Vehicle v = new BigBus(new SmallEngine());
         v.drive();
         Vehicle v1 = new BigBus(new SmallEngine());
         Assert.assertEquals(v.getWeight(), v1.getWeight()); 
     }
     
     @Test
     public void TestBigEngineTest(){
         Vehicle v2 = new BigBus(new BigEngine());
         v2.drive();
         Vehicle v3 = new BigBus(new BigEngine());
         Assert.assertEquals(v2.getWeight(), v3.getWeight());
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
