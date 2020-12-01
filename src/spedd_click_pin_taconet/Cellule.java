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
public class Cellule {
    Bouton BoutonCourant;
public boolean presenceBoutonVert(){
    if(BoutonCourant.lireEtat()=="Vert"){
        return true;
    }
    else{
        return false;
    }
}
public boolean presenceBoutonNoir(){
    if(BoutonCourant.lireEtat()=="Noir"){
        return true;
    }
    else{
        return false;
    }
}
public boolean presenceBoutonRouge(){
    if(BoutonCourant.lireEtat()=="Rouge"){
        return true;
    }
    else{
        return false;
    }
}
public boolean presenceBoutonEteint(){
    if(BoutonCourant.lireEtat()=="Eteint"){
        return true;
    }
    else{
        return false;
    }
}
}
