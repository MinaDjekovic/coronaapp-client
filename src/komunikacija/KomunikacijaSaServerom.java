/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Mina
 */
public class KomunikacijaSaServerom {
    private static KomunikacijaSaServerom instance;
    private Socket s;

    private KomunikacijaSaServerom() throws Exception {
        try {
            s = new Socket("localhost", 9000);
        } catch (IOException ex) {
            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Greška u mrežnoj komunikaciji prilikom uspostavljanja konekcije sa serverom. ");
        }
    }

    public static KomunikacijaSaServerom getInstance() throws Exception {
        if(instance == null)
            instance = new KomunikacijaSaServerom();
        return instance;
    }
    
    public void posaljiZahtev(KlijentskiZahtev kz) throws Exception{
        try{       
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            oos.writeObject(kz);
        } catch (IOException ex) {
            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Greška u mrežnoj komunikaciji prilikom slanja zahteva ka serveru. ");
        } 
    }
    public ServerskiOdgovor primiOdgovor() throws Exception{
        ServerskiOdgovor so = new ServerskiOdgovor();
        
        try {
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            so = (ServerskiOdgovor) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Greška u mrežnoj komunikaciji prilikom prijema odgovora od serveru. ");
        }
        
        return so;
    }
}
