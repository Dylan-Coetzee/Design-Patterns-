/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Animal;
import AbstractFactoryPattern.SpeciesFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kurvin Hendricks
 */
public class AbstractFactoryPattern {
    
    public AbstractFactoryPattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
        AbstractFactory af = new AbstractFactory();
        
        SpeciesFactory sf = af.getSpeciesFactory("bird");
        Animal a = sf.getAnimal("chicken");
        Assert.assertEquals(a.makeSound(), "kakaaaa");
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
