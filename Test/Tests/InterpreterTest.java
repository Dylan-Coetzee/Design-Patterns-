/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import InterpreterPattern.AndExpression;
import InterpreterPattern.Expression;
import InterpreterPattern.OrExpression;
import InterpreterPattern.TerminalExpression;
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
public class InterpreterTest {
    
    public InterpreterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }
    
    public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
    
     @Test
     public void testOrExpression() {
         Expression isMale = getMaleExpression();
         Assert.assertEquals(isMale.interpreter("Robert"), true);
     }

     @Test
     public void testAndExpression() {
         Expression isMarried = getMaleExpression();
         Assert.assertEquals(isMarried.interpreter("Julie"), false);
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
