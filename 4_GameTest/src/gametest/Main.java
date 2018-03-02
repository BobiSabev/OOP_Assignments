/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametest;


/**
 *
 * @author Borislav
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player[] players = new Player[2];
        players[0] = new Player("Boris", Field.RED, new HumanStrategy());
        players[1] = new Player("Aida", Field.YELLOW, new HumanStrategy());
        
        Game game = new Game(players);
        
        for(int i =0; i<4;i++){
            game.playTurn();
            System.out.println(game.getBoard().toString());
        }
        
        
        
        
        /*
        TODO
            implement play in HumanStrategy and ComputeStrategy 
            winnable in Board
        
        
            MVC controller
                model - specify core aspects of the game
                view - independently of how these are presented 
                controller - to a user or how a 
user interacts with them 
        
            View - create Connect4TUI, init all players and the game, make nessesary presentation
            
            
        
        
        
        
        
        */
       
       
    }
    
}
