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
public abstract class Vehicle {
    Engine engine;
    int weight;
    
    public abstract void drive();
    
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    
    public void reportOnSpeed(int bhp){
        int ratio = weight / bhp;
        if(ratio < 3){
            System.out.println("The vehicle is not going at a fast speed");
        }else if((ratio >=3 )&&(ratio < 8)){
            System.out.println("The vehicle is going at an avegrage speed");
        } else System.out.println("The vehicle is going at a slow speed ");
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }
    
}
