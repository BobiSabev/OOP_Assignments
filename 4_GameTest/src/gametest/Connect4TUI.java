/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametest;

import java.util.Scanner;

/**
 *
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class Connect4TUI {
    
    private Game game;
    private Player user;
    private Player computer;
    private Scanner in;

    public Connect4TUI() {
        this.user = new Player("Boris", Field.RED, new HumanStrategy());
        this.computer = new Player("Computer", Field.YELLOW, new ComputerStrategy());
        this.game = null;
        this.in = new Scanner(System.in);
    }
    
    
    public void playGame(){
        this.game = new Game(new Player[]{this.user, this.computer});
        PlayerController control = new PlayerController((HumanStrategy)this.user.getStrategy(), this.in);
        while(!this.game.getBoard().winning()){
            
            // print the board
            System.out.println(this.game.getBoard().toString());
            
            
            // update depending on user or computer
            if(game.getNextPlayer() == 0){
                control.update((HumanStrategy)this.user.getStrategy(), Board.NCOL);
            }
            else {
                // give ComputerStrategy a copy of the board
                control.updateComputer((ComputerStrategy)this.computer.getStrategy(), this.game.getBoard().copy());
                System.out.println("Computer played: ");
            }
            
            
            // play turn
            this.game.playTurn();
        }
        
        
        System.out.println(this.game.getBoard().toString());
        System.out.println("\nThe winner is player " + this.game.winner() + "\n");
        
        
    }
    
}
