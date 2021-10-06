/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import forme.FrmAdministrator;
import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mina
 */
public class OsvezavanjeAdminPanelaNit extends Thread{
    private FrmAdministrator frm;

    public OsvezavanjeAdminPanelaNit(FrmAdministrator frm) {
        this.frm = frm;
    }

    @Override
    public void run() {
        while(!interrupted()){
            try {
                sleep(1000);
                frm.osvezi();
            } catch (InterruptedException ex) {
                Logger.getLogger(OsvezavanjeKorisnickogPanelaNit.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
    
    
    
    
    
    
}
