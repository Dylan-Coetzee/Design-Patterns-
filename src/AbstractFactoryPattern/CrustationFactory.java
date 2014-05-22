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
public class CrustationFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type) {
        if("crab".equals(type)){
            return new Crab();
        }else return null;
    }
    
}
