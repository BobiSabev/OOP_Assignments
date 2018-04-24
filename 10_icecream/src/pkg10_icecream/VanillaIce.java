/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_icecream;

import static pkg10_icecream.Price.VANILLA_ICE;

/**
 *
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class VanillaIce extends Ice {
    
    public VanillaIce() {
        super();
        description = "vanilla ice";
    }
    
    @Override
    public int getPrice() {
        return VANILLA_ICE.price();
    }
    
}
