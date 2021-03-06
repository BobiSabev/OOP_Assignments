/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametest;

/**
 *
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class HumanStrategy implements PlayerStrategy {

    private PlayerObserver controller;
    private int colToPlay;

    /**
     * 
     * @return int for what column to play
     */
    @Override
    public int play() {
        return this.colToPlay;
    }
    
    public void setColToPlay(int colToPlay){
        this.colToPlay = colToPlay;
    }
    
    @Override
    public void register(PlayerObserver controller) {
        this.controller = controller;
    }
    
}
