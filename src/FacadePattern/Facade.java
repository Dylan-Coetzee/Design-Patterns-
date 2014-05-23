/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FacadePattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class Facade {
    public int cubeX(int x){
        Class1 c = new Class1();
        return c.doSomethingOdd(x);
    }
    
    public int cubeX2(int x){
        Class1 c = new Class1();
        Class2 c2 = new Class2();
        return c2.doMoreStuff(c, x);
    }
    
    public int cubeX3(int x){
        Class1 c = new Class1();
        Class2 c2 = new Class2();
        Class3 c3 = new Class3();
        return c3.doOtherRandomThings(c, c2, x);
    }
}
