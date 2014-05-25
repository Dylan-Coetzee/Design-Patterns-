/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfReposibility;

/**
 *
 * @author Dylan
 */
public class FerrariHandler extends CarHandler{

    @Override
    public void handleRequest(VehicleEnum request) {
        if(request == VehicleEnum.FERRARI)
            System.out.println("FERRARI Handler handles " + request);
        else System.out.println("FERRARI Handler does not handle this " + request);
        if(successor != null){
            successor.handleRequest(request);
            
        }
    }
    
}
