/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuilderPattern;

/**
 *
 * @author Kurvin Hendricks
 */
public class WorkPerson implements PersonBuilder{
    
    private Person p;
        
    public WorkPerson(){
        p = new Person();
    }
    
    @Override
    public void buildName() {
        p.setName("Kurvin");
    }

    @Override
    public void buildSurname() {
        p.setSurname("Hendricks");
    }

    @Override
    public Person getPerson() {
        return p;
    }
    
}
