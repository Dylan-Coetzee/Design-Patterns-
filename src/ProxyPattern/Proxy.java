/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProxyPattern;

import java.util.Date;

/**
 *
 * @author Dylan
 */
public class Proxy {
    SlowThing st;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }
    
    public void sayHello(){
        if(st == null){
            st = new SlowThing();
        }st.sayHello();
    }
    
}
