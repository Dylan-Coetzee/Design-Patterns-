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
public class TemperatureReporter extends CelciusReporter implements TemperatureInfo{
    
    @Override
    public double getTempCelcius(){
        return tempCelcius;
    }
    
    @Override
    public void setTempCelcius(double tempCelcius){
        this.tempCelcius = tempCelcius;
    }

    @Override
    public double getTempFahrenheit() {
        return C2F(tempCelcius);
    }

    @Override
    public void setTempFahrenheit(double tempFahrenheit) {
       this.tempCelcius = F2C(tempCelcius);
    }
    
    public double F2C(double f){return ((f - 32) * 5/9);}
    public double C2F(double c){ return ((c * 9 / 5) + 32);}
    
}
