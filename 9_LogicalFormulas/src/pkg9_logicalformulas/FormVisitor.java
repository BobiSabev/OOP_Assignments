/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_logicalformulas;

/**
 *
 * @author Borislav
 */
interface FormVisitor {

    // instead of void, return a generic evaluating the form
    boolean visit( BinOpForm form );
    boolean visit( NotForm form);
    boolean visit( AtomForm form);
    boolean visit( ConstForm form);
}
