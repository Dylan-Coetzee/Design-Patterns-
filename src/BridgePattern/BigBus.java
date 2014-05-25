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
public class BigBus extends Vehicle{
    
    public BigBus(Engine engine){
        this.weight = 3000;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\nThe big bus is driving");
        int bhp = engine.go();
        reportOnSpeed(bhp);
    }
    
}
