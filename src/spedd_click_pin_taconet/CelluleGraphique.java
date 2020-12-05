/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spedd_click_pin_taconet;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Donatien
 */
public class CelluleGraphique extends JButton {
    Cellule celluleAssociee;
    ImageIcon img_vert =new javax.swing.ImageIcon(getClass().getResource("/images/Bouton_vert.png"));
    ImageIcon img_noir =new javax.swing.ImageIcon(getClass().getResource("/images/Bouton_noir.png"));
    ImageIcon img_rouge =new javax.swing.ImageIcon(getClass().getResource("/images/Bouton_rouge.png"));
    ImageIcon img_eteint =new javax.swing.ImageIcon(getClass().getResource("/images/Bouton_eteint.png"));
    
    public CelluleGraphique(Cellule uneCellule){
        celluleAssociee=uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent (G);
        //if(celluleAssociee.BoutonCourant!=null){
            if (celluleAssociee.presenceBoutonEteint()==true){
            setIcon(img_eteint);
        }
            else if (celluleAssociee.presenceBoutonNoir()==true){
            setIcon(img_noir);
        }
            else if (celluleAssociee.presenceBoutonRouge()==true){
            setIcon(img_rouge);
           
        }
            else if(celluleAssociee.presenceBoutonVert()==true){
            setIcon(img_vert);
        }
        }
    }
