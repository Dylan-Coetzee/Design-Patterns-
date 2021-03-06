/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dylan
 */
public class Composite implements Component{
    List<Component> components = new ArrayList<>();

    @Override
    public String sayHello() {
        for(Component component : components){
            return component.sayHello();
        }
        return null;
    }

    @Override
    public String sayGoodbye() {
        for(Component component : components){
            return component.sayGoodbye();
        }
        return null;
    }
    
    public void add(Component component){
        components.add(component);
    }
    
    public void remove(Component component){
        components.remove(component);
    }
    
    public List<Component> getComponents(){
        return components;
    }
    
    public Component getComponent(int index){
        return components.get(index); 
    }
}
