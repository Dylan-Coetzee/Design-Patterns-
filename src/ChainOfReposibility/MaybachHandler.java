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
public class MaybachHandler extends CarHandler{

    @Override
    public void handleRequest(VehicleEnum request) {
       if(request == VehicleEnum.MAYBACH)
            System.out.println("MAYBACH Handler handles " + request);
        else System.out.println("MAYBACH Handler does not handle this " + request);
        if(successor != null){
            successor.handleRequest(request);
            
        }
    }
    
}
