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
public class BirdFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
       if("chicken".equals(type)){
           return new Chicken();
       }else return null;
    }
    
}
