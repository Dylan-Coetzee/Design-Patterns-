/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import ChainOfReposibility.VehicleEnum;
import ChainOfReposibility.CarHandler;
import ChainOfReposibility.MaybachHandler;
import ChainOfReposibility.FerrariHandler;
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
public class ChainOfResponsibilityTest {
    
    public ChainOfResponsibilityTest() {
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    public static CarHandler setUpChain(){
     CarHandler ferrariHandler = new FerrariHandler();
     CarHandler maybachHandler = new MaybachHandler();
     ferrariHandler.setSuccessor(maybachHandler);
     return ferrariHandler;
    }
    
     @Test
     public void hello() {
         CarHandler chain = setUpChain();
         chain.handleRequest(VehicleEnum.MAYBACH);
         Assert.assertNotNull(chain);
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
