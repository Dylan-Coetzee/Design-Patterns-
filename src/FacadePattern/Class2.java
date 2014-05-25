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
public class Class2 {
    public int doMoreStuff(Class1 c1, int x){
        return 2 * c1.doSomethingOdd(x);
    }
}
