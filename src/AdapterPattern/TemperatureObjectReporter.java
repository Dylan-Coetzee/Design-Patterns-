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
public class TemperatureObjectReporter implements TemperatureInfo
{
    
    CelciusReporter cr;

    public TemperatureObjectReporter() {
        cr = new CelciusReporter();
    }
    
    @Override
    public double getTempFahrenheit() {
        return C2F(cr.getTemp());
    }

    @Override
    public void setTempFahrenheit(double tempFahrenheit) {
        cr.setTemp(F2C(tempFahrenheit));
    }

    @Override
    public double getTempCelcius() {
        return cr.getTemp();
    }

    @Override
    public void setTempCelcius(double tempCelcius) {
        cr.setTemp(tempCelcius);
    }

    public double F2C(double f){return ((f - 32) * 5/9);}
    public double C2F(double c){ return ((c * 9 / 5) + 32);}
    
}
