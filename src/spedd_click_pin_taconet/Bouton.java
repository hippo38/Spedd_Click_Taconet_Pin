/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spedd_click_pin_taconet;

/**
 *
 * @author hpin
 */
public class Bouton {
        String Etat;
    public Bouton(String unEtat){
        Etat=unEtat;
    }
    public String lireEtat(){
        return Etat;
    }
}

