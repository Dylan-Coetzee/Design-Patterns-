/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BridgePattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class SmallEngine implements Engine{
    int bhp;

    public SmallEngine() {
        bhp = 100;
    }

    @Override
    public int go() {
        System.out.println("The small engine is running");
        return bhp;
    }
    
    
}
