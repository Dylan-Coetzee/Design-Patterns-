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
public class SmallCar extends Vehicle{

    public SmallCar(Engine engine) {
        this.weight = 600;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("\n The small car is driving");
        int bhp = engine.go();
        reportOnSpeed(bhp);
    }
    
    
    
}
