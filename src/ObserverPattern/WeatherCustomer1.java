/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObserverPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class WeatherCustomer1 implements WeatherObserver{

    @Override
    public void doUpdate(int tempreature) {
        System.out.println("Weather customer 1 just found out the tempreature is: " + tempreature);
    }
    
}
