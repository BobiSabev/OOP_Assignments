/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_gametest;

import pkg4_gametest.Field.Color;

/**
 *
 * @author Borislav
 */
public interface Player {
    
    String getName();
    void setName(String name);
    Color getColor();
    void setColor(Color color);
    int play();  
}
