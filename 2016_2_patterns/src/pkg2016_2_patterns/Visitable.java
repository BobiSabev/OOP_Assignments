/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016_2_patterns;

/**
 *
 * @author Borislav
 */
public interface Visitable<E> {
    void accept(Visitor<E> visitor);
}

