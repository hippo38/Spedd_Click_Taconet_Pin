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
    Bouton BoutonInit=new Bouton("Eteint");
     Grille(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                Cellules[i][j]=new Cellule(BoutonInit);
            }
            
        }
}
    public boolean resteBoutonsVerts(){
        int a=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(Cellules[i][j].presenceBoutonVert()==false){
                a=a+1;
                }
                
                
            }
            
        }
        if(a==42){
            return false;
        }
        else{
            return true;
        }
    }
    public void viderGrille(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
            Cellules[i][j].BoutonCourant.Etat="Eteint"; 
            }
        }
    }
    public boolean placerBoutonVert(int i, int j){
        if(Cellules[i][j].presenceBoutonVert()==false){
            Cellules[i][j].BoutonCourant.Etat="Vert";
            return true;
        }
        else{
            return false;
        }
    } 
    public boolean placerBoutonNoir(int i, int j){
        if(Cellules[i][j].presenceBoutonNoir()==false){
            Cellules[i][j].BoutonCourant.Etat="Noir";
            return true;
        }
        else{
            return false;
        }
    } 
    public boolean placerBoutonRouge(int i, int j){
        if(Cellules[i][j].presenceBoutonRouge()==false){
            Cellules[i][j].BoutonCourant.Etat="Rouge";
            return true;
        }
        else{
            return false;
        }
    } 
    public boolean placerBoutonEteint(int i, int j){
        if(Cellules[i][j].presenceBoutonEteint()==false){
            Cellules[i][j].BoutonCourant.Etat="Eteint";
            return true;
        }
        else{
            return false;
        }
     
    }
}

