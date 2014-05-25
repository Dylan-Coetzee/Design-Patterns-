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
public interface TemperatureInfo {
    public double getTempFahrenheit();
    public void setTempFahrenheit(double tempFahrenheit);
    public double getTempCelcius();
    public void setTempCelcius(double tempCelcius);
}
