/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactoryPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class Chicken extends Animal{

    @Override
    public String makeSound() {
      return "kakaaaa";
    }
    
}
