/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FacadePattern;

/**
 *
 * @author Dylan
 */
public class Class3 {
    public int doOtherRandomThings(Class1 c1, Class2 c2, int x){
        return c1.doSomethingOdd(x) * c2.doMoreStuff(c1, x);
    }
}
