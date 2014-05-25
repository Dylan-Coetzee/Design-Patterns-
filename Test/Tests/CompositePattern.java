/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import CompositePattern.Composite;
import CompositePattern.Leaf;
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
public class CompositePattern {
    
    public CompositePattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         Leaf l = new Leaf("Swan");
         Leaf l1 = new Leaf("Tilian");
         
         Composite c1 = new Composite();
         c1.add(l);
         c1.add(l1);

         Assert.assertEquals(c1.getComponent(0).sayHello(), l.getName() + " leaf says hello");
         Assert.assertEquals(c1.getComponent(1).sayHello(), l1.getName() + " leaf says hello");
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
