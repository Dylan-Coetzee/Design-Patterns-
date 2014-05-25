/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BridgePattern;

/**
 *
 * @author Dylan
 */
public class BigEngine implements Engine{
    int bhp;

    public BigEngine() {
        bhp = 350;
    }

    @Override
    public int go() {
        System.out.println("The bog engine is running");
        return bhp;
    }
    
    
    
}
