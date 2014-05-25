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
 * @author Dylan
 */
public class AbstractFactoryPattern {
    
    public AbstractFactoryPattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void AnimalTest() {
        AbstractFactory af = new AbstractFactory();
        
        SpeciesFactory sf = af.getSpeciesFactory("retitle");
        Animal a = sf.getAnimal("snake");
        Assert.assertEquals(a.makeSound(), "Ssssss");
        
        Animal a1 = sf.getAnimal("tyrannosaurus");
        Assert.assertEquals(a1.makeSound(), "Roar");
        
         
     }
     
     @Test
     public void animalMammalTest(){
        AbstractFactory af = new AbstractFactory();
        SpeciesFactory sf2 = af.getSpeciesFactory("mammal");
        Animal a2 = sf2.getAnimal("dog");
        Assert.assertEquals(a2.makeSound(), "Woof");
        
        Animal a3 = sf2.getAnimal("cat");
        Assert.assertEquals(a3.makeSound(), "Meow");
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
