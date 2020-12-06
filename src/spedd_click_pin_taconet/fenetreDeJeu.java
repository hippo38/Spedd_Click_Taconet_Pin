/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spedd_click_pin_taconet;

import java.util.Random;

/**
 *
 * @author Donatien
 */
public class fenetreDeJeu extends javax.swing.JFrame {
    
    /**
     * Creates new form fenetreDeJeu
     */
    Random random=new Random();
    
    int compteur;
    Cellule Cellules[][]=new Cellule[7][7];
    Grille Grilledejeu=new Grille();
    
    public fenetreDeJeu() {
        initComponents();
        Panel_intro.setVisible(true);
        Panel_jeu.setVisible(false);
        Panel_fin.setVisible(false);
        //Grille Grilledejeu=new Grille();
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                CelluleGraphique cellGraph =new CelluleGraphique(Grilledejeu.Cellules[i][j]);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Cellule c=cellGraph.celluleAssociee;
                    if (c.presenceBoutonVert()){
                        c.BoutonCourant.Etat="Eteint";
                        compteur=compteur+1;
                        
                        if (resteBoutonsVerts()==false){
                            nouvelleGrille();
                            
                        }
                        
                        Panel_jeu.repaint();
                    }else if (c.presenceBoutonRouge()){
                        c.BoutonCourant.Etat="Eteint";
                        compteur=compteur-5;
                    }else if (c.presenceBoutonNoir()){
                        compteur=0;
                        lbl_scorefinal.setText(compteur+"");
                        lbl_causefin.setText("GAME OVER! YOU HIT A BLACK BUTTON");
                        Panel_jeu.setVisible(false);
                        Panel_fin.setVisible(true);
                    }
                    lbl_score.setText(compteur+"");
                    }
                });
                Panel_grille.add(cellGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_jeu = new javax.swing.JPanel();
        Panel_grille = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_score = new javax.swing.JLabel();
        Panel_intro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        Panel_fin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_causefin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_scorefinal = new javax.swing.JLabel();
        btn_restart = new javax.swing.JButton();
        btn_quit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_jeu.setBackground(new java.awt.Color(204, 153, 255));
        Panel_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_grille.setBackground(new java.awt.Color(255, 255, 255));
        Panel_grille.setLayout(new java.awt.GridLayout(7, 7));
        Panel_jeu.add(Panel_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 672, 672));

        jLabel2.setFont(new java.awt.Font("Terminator Two", 3, 24)); // NOI18N
        jLabel2.setText("SPEED CLICK");
        Panel_jeu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 200, 50));

        jLabel3.setFont(new java.awt.Font("Terminator Two", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Score:");
        Panel_jeu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 90, 70));

        lbl_score.setFont(new java.awt.Font("Terminator Two", 1, 18)); // NOI18N
        lbl_score.setForeground(new java.awt.Color(255, 255, 255));
        lbl_score.setText("arbitraire");
        Panel_jeu.add(lbl_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 265, -1, -1));

        getContentPane().add(Panel_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        Panel_intro.setBackground(new java.awt.Color(0, 0, 153));
        Panel_intro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Terminator Two", 3, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SPEED CLICK");
        Panel_intro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 620, 320));

        btn_start.setBackground(new java.awt.Color(255, 255, 255));
        btn_start.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        Panel_intro.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 170, 90));

        getContentPane().add(Panel_intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        Panel_fin.setBackground(new java.awt.Color(255, 153, 153));
        Panel_fin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Terminator Two", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("FIN DE PARTIE!");
        Panel_fin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 470, 70));

        lbl_causefin.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lbl_causefin.setForeground(new java.awt.Color(102, 102, 102));
        lbl_causefin.setText("cause fin");
        Panel_fin.add(lbl_causefin, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 230, 500, 50));

        jLabel5.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("SCORE FINAL:");
        Panel_fin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 360, -1, -1));

        lbl_scorefinal.setFont(new java.awt.Font("Terminator Two", 0, 18)); // NOI18N
        lbl_scorefinal.setText("score final");
        Panel_fin.add(lbl_scorefinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        btn_restart.setBackground(new java.awt.Color(255, 255, 255));
        btn_restart.setFont(new java.awt.Font("Terminator Two", 2, 12)); // NOI18N
        btn_restart.setText("restart");
        btn_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restartActionPerformed(evt);
            }
        });
        Panel_fin.add(btn_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 120, 50));

        btn_quit.setBackground(new java.awt.Color(255, 255, 255));
        btn_quit.setFont(new java.awt.Font("Terminator Two", 2, 12)); // NOI18N
        btn_quit.setText("Quit");
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });
        Panel_fin.add(btn_quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 150, 50));

        getContentPane().add(Panel_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        setBounds(0, 0, 1046, 729);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        Panel_intro.setVisible(false);
        Panel_jeu.setVisible(true);
        initialiserPartie();
        lbl_score.setText(compteur+"");
        
        
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restartActionPerformed
        // TODO add your handling code here:
        initialiserPartie();
        Panel_intro.setVisible(false);
        Panel_jeu.setVisible(true);
        
        lbl_score.setText(compteur+"");
    }//GEN-LAST:event_btn_restartActionPerformed

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        // TODO add your handling code here:
        Panel_fin.setVisible(false);
    }//GEN-LAST:event_btn_quitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }
    public void initialiserPartie(){
        //Grille Cellules=new Grille();
        //Cellules.viderGrille();
        compteur=0;
        for (int i=0; i<7; i++){
            for (int j=0; j<7; j++){
                Grilledejeu.placerBoutonEteint(i, j);
            }
        }
        //if(Grilledejeu.Cellules[4][4].presenceBoutonVert()==false){
         Grilledejeu.placerBoutonVert(3,3);
        
            
    }
    public boolean resteBoutonsVerts(){
        int z=0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(Grilledejeu.Cellules[i][j].presenceBoutonVert()){
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
    public boolean placerBoutonVert(int i, int j){
        if(Grilledejeu.Cellules[i][j].presenceBoutonVert()==false){
            Grilledejeu.Cellules[i][j].BoutonCourant.Etat="Vert";
            return true;
        }
        else{
            return false;
        }
    } 
    public boolean placerBoutonNoir(int i, int j){
        if(Grilledejeu.Cellules[i][j].presenceBoutonNoir()==false){
            Grilledejeu.Cellules[i][j].BoutonCourant.Etat="Noir";
            return true;
        }
        else{
            return false;
        }
    } 
    public boolean placerBoutonRouge(int i, int j){
        if(Grilledejeu.Cellules[i][j].presenceBoutonRouge()==false){
            Grilledejeu.Cellules[i][j].BoutonCourant.Etat="Rouge";
            return true;
        }
        else{
            return false;
        }
    } 
    public boolean placerBoutonEteint(int i, int j){
        if(Grilledejeu.Cellules[i][j].presenceBoutonEteint()==false){
            Grilledejeu.Cellules[i][j].BoutonCourant.Etat="Eteint";
            return true;
        }
        else{
            return false;
        }
     
    }
    public void viderGrille(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
            Grilledejeu.Cellules[i][j].BoutonCourant.Etat="Eteint"; 
            }
        }
    }
    public void placerBoutonNoirRandom(){
        Random random=new Random();
        int i=new Random().nextInt(7);
        int j=new Random().nextInt(7);
        if (Grilledejeu.Cellules[i][j].BoutonCourant.Etat=="Eteint"){
                placerBoutonNoir(i,j);
        }else{
            placerBoutonNoirRandom();
        }
    }
    public void placerBoutonRougeRandom(){
        Random random=new Random();
        int i=new Random().nextInt(7);
        int j=new Random().nextInt(7);
        if (Grilledejeu.Cellules[i][j].BoutonCourant.Etat=="Eteint"){
                placerBoutonRouge(i,j);
        }else{
            placerBoutonRougeRandom();
        }
    }
    public void placerBoutonVertRandom(){
        Random random=new Random();
        int i=new Random().nextInt(7);
        int j=new Random().nextInt(7);
        if (Grilledejeu.Cellules[i][j].BoutonCourant.Etat=="Eteint"){
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_fin;
    private javax.swing.JPanel Panel_grille;
    private javax.swing.JPanel Panel_intro;
    private javax.swing.JPanel Panel_jeu;
    private javax.swing.JButton btn_quit;
    private javax.swing.JButton btn_restart;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_causefin;
    private javax.swing.JLabel lbl_score;
    private javax.swing.JLabel lbl_scorefinal;
    // End of variables declaration//GEN-END:variables
}
