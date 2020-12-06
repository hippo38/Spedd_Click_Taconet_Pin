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
public class Grille {
    Cellule Cellules[][]=new Cellule[7][7];
    //Bouton BoutonInit=new Bouton("Eteint");
    
    
     Grille(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                Bouton BoutonInit=new Bouton("Eteint");
                Cellules[i][j]=new Cellule(BoutonInit);
            }
            
        }
    }
    public boolean resteBoutonsVerts(){
        int z=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(Cellules[i][j].presenceBoutonVert()){
                    z=z+1;
                }
            }
        }
        if (z==0){
            return false;
        } else {
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
    
    public void placerBoutonNoirRandom(){
        Random random=new Random();
        int i=new Random().nextInt(7);
        int j=new Random().nextInt(7);
        if (Cellules[i][j].BoutonCourant.Etat=="Eteint"){
                placerBoutonNoir(i,j);
        }else{
            placerBoutonNoirRandom();
        }
    }
    public void placerBoutonRougeRandom(){
        Random random=new Random();
        int i=new Random().nextInt(7);
        int j=new Random().nextInt(7);
        if (Cellules[i][j].BoutonCourant.Etat=="Eteint"){
                placerBoutonRouge(i,j);
        }else{
            placerBoutonRougeRandom();
        }
    }
    public void placerBoutonVertRandom(){
        Random random=new Random();
        int i=new Random().nextInt(7);
        int j=new Random().nextInt(7);
        if (Cellules[i][j].BoutonCourant.Etat=="Eteint"){
                placerBoutonVert(i,j);
        }else{
            placerBoutonVertRandom();
        }
    }
    
    public void nouvelleGrille(){
        Random random=new Random();
        viderGrille();
        int kvar = new Random().nextInt(3)+2;
        int mvar = new Random().nextInt(4)+6;
        int nvar = new Random().nextInt(3)+3;
        for (int k=0; k<kvar; k++){
            placerBoutonNoirRandom();
            
            }
        for(int m=0;m<mvar;m++){
            placerBoutonRougeRandom();
        }
        for(int n=0;n<nvar;n++){
            placerBoutonVertRandom();    
        }         
        
    }
}

