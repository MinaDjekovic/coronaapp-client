/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Korisnik;
import domen.Stanje;
import domen.Statistika;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontroler.*;
import modeli.ModelTabeleKorisnik;

/**
 *
 * @author Mina
 */
public class FrmAdministrator extends javax.swing.JFrame {

    private boolean inicijalizovana;

    /**
     * Creates new form FrmAdministrator
     */
    public FrmAdministrator() {
        initComponents();
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlStatistika = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBrojTestiranja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBrojPozitivnih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBrojNegativnih = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrojPodNadzorom = new javax.swing.JTextField();
        pnlPregledKorisnika = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblZakasneliPonovljeniTestSamoprocene = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNoviPozitivni = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRezultatiPretrage = new javax.swing.JTable();
        chbPozitivni = new javax.swing.JCheckBox();
        chbNegativni = new javax.swing.JCheckBox();
        chbPodNadzorom = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlStatistika.setBorder(javax.swing.BorderFactory.createTitledBorder("Statistika"));

        jLabel1.setText("Broj testiranja:");

        jLabel2.setText("Broj pozitivnih:");

        jLabel3.setText("Broj negativnih:");

        jLabel4.setText("Broj pod nadzorom:");

        javax.swing.GroupLayout pnlStatistikaLayout = new javax.swing.GroupLayout(pnlStatistika);
        pnlStatistika.setLayout(pnlStatistikaLayout);
        pnlStatistikaLayout.setHorizontalGroup(
            pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatistikaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBrojTestiranja, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(txtBrojPozitivnih)
                    .addComponent(txtBrojNegativnih)
                    .addComponent(txtBrojPodNadzorom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStatistikaLayout.setVerticalGroup(
            pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatistikaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBrojTestiranja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrojPozitivnih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBrojNegativnih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlStatistikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBrojPodNadzorom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlPregledKorisnika.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregled korisnika"));

        jLabel5.setText("Novi pozitivni:");

        tblZakasneliPonovljeniTestSamoprocene.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblZakasneliPonovljeniTestSamoprocene);

        tblNoviPozitivni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblNoviPozitivni);

        jLabel6.setText("Zakasneli ponovljeni test samoprocene:");

        tblRezultatiPretrage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblRezultatiPretrage);

        chbPozitivni.setText("Pozitivni");
        chbPozitivni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPozitivniActionPerformed(evt);
            }
        });

        chbNegativni.setText("Negativni");
        chbNegativni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbNegativniActionPerformed(evt);
            }
        });

        chbPodNadzorom.setText("Pod nadzorom");
        chbPodNadzorom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPodNadzoromActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPregledKorisnikaLayout = new javax.swing.GroupLayout(pnlPregledKorisnika);
        pnlPregledKorisnika.setLayout(pnlPregledKorisnikaLayout);
        pnlPregledKorisnikaLayout.setHorizontalGroup(
            pnlPregledKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPregledKorisnikaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlPregledKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPregledKorisnikaLayout.createSequentialGroup()
                        .addComponent(chbPozitivni)
                        .addGap(43, 43, 43)
                        .addComponent(chbNegativni)
                        .addGap(37, 37, 37)
                        .addComponent(chbPodNadzorom))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPregledKorisnikaLayout.setVerticalGroup(
            pnlPregledKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPregledKorisnikaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPregledKorisnikaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbPozitivni)
                    .addComponent(chbNegativni)
                    .addComponent(chbPodNadzorom))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStatistika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPregledKorisnika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStatistika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPregledKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbPozitivniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPozitivniActionPerformed
        if (inicijalizovana) {
            pretragaKorisnika();
        }
    }//GEN-LAST:event_chbPozitivniActionPerformed

    private void chbNegativniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbNegativniActionPerformed
        if (inicijalizovana) {
            pretragaKorisnika();
        }
    }//GEN-LAST:event_chbNegativniActionPerformed

    private void chbPodNadzoromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPodNadzoromActionPerformed
        if (inicijalizovana) {
            pretragaKorisnika();
        }
    }//GEN-LAST:event_chbPodNadzoromActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbNegativni;
    private javax.swing.JCheckBox chbPodNadzorom;
    private javax.swing.JCheckBox chbPozitivni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnlPregledKorisnika;
    private javax.swing.JPanel pnlStatistika;
    private javax.swing.JTable tblNoviPozitivni;
    private javax.swing.JTable tblRezultatiPretrage;
    private javax.swing.JTable tblZakasneliPonovljeniTestSamoprocene;
    private javax.swing.JTextField txtBrojNegativnih;
    private javax.swing.JTextField txtBrojPodNadzorom;
    private javax.swing.JTextField txtBrojPozitivnih;
    private javax.swing.JTextField txtBrojTestiranja;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        try {
            this.setTitle("Admin panel");
            Statistika stat = Kontroler.getInstance().statistika();
            txtBrojTestiranja.setText(stat.getBrojTestiranja() + "");
            txtBrojPozitivnih.setText(stat.getBrojPozitivnih() + "");
            txtBrojNegativnih.setText(stat.getBrojNegativnih() + "");
            txtBrojPodNadzorom.setText(stat.getBrojPodNadzorom() + "");
            tblNoviPozitivni.setModel(new ModelTabeleKorisnik(Kontroler.getInstance().noviPozitivniKorisnici()));
            tblZakasneliPonovljeniTestSamoprocene.setModel(new ModelTabeleKorisnik(Kontroler.getInstance().zakasniliPonovniTestKorisnici()));
            tblRezultatiPretrage.setModel(new ModelTabeleKorisnik(new ArrayList<>()));
            inicijalizovana = true;
        } catch (Exception ex) {
            //Logger.getLogger(FrmAdministrator.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void pretragaKorisnika() {
        try {
            List<Korisnik> lista = new ArrayList<>();
            Korisnik zaPretragu = new Korisnik();
            zaPretragu.setKorisnikID(-1);
            if (chbPozitivni.isSelected()) {
                zaPretragu.setStanje(Stanje.pozitivan);
                lista.addAll(Kontroler.getInstance().pretragaKorisnika(zaPretragu));
            }
            if (chbNegativni.isSelected()) {
                zaPretragu.setStanje(Stanje.negativan);
                lista.addAll(Kontroler.getInstance().pretragaKorisnika(zaPretragu));
            }
            if (chbPodNadzorom.isSelected()) {
                zaPretragu.setStanje(Stanje.pod_nadzorom);
                lista.addAll(Kontroler.getInstance().pretragaKorisnika(zaPretragu));
            }
            ((ModelTabeleKorisnik) tblRezultatiPretrage.getModel()).refresh(lista);
        } catch (Exception ex) {
            //Logger.getLogger(FrmAdministrator.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    public void osvezi(){
        srediFormu();
        pretragaKorisnika();
    }
}
