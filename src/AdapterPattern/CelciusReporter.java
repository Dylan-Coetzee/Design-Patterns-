/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdapterPattern;

/**
 *
 * @author Dylan
 */
public class CelciusReporter {
    double tempCelcius;
    
    public CelciusReporter(){
    }

    public double getTemp() {
        return tempCelcius;
    }

    public void setTemp(double tempCelcius) {
        this.tempCelcius = tempCelcius;
    }
    
}
