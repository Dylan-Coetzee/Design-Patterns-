/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FlyweightPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class FlyweightMultiplyer implements Flyweight{
    
    String operation; 
    public FlyweightMultiplyer() {
         operation = "multiplying";
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Override
    public void doMath(int a, int b) {
        System.out.println(operation + " " + a + " and " + b + ": " + (a*b));
    }
    
}
