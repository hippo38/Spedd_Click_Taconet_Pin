/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spedd_click_pin_taconet;

import java.util.Random;

/**
 *
 * @author hpin
 */
public class Partie {
    Random random=new Random();
    Grille Grilledejeu=new Grille();
    int compteur;
    
    public void initialiserPartie(){
        Grille Cellules=new Grille();
        Cellules.viderGrille();
        compteur=0;
        Grilledejeu.placerBoutonVert(4, 4);
            
    }
}
