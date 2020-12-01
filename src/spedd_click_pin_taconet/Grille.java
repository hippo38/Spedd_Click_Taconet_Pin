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
public class Grille {
    Cellule Cellules[][]=new Cellule[7][7];
     
     Grille(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                Cellules[i][j]=new Cellule();
            }
            
        }
}
public boolean resteBoutonsVerts(){
    for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(Cellules[i][j].lireEtat()=="vert"){
                    
                }
            }
            
        }
}
}
