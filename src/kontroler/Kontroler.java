/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import domen.Korisnik;
import domen.Statistika;
import domen.Test;
import domen.TipTesta;
import forme.FrmAdministrator;
import forme.FrmKorisnik;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacije;
import transfer.KlijentskiZahtev;
import transfer.ServerskiOdgovor;

/**
 *
 * @author Mina
 */
public class Kontroler {

    private SimpleDateFormat sdf;

    private static Kontroler instance;

    public Kontroler() {
        sdf = new SimpleDateFormat("dd.MM.yyyy.");
    }

    public static Kontroler getInstance() {
        if (instance == null) {
            instance = new Kontroler();
        }
        return instance;
    }

    public String formatDatum(Date datum) {
        return sdf.format(datum);
    }

    public Date parseDatum(String datum) throws ParseException {
        return sdf.parse(datum);
    }

    public List<Test> pretragaTestova(Test zaPretragu) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.PRETRAGA_TESTOVA, zaPretragu);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (List<Test>) so.getOdgovor();        
    }

    public Korisnik prijavaKorisnika(Korisnik zaPrijavu) throws Exception {
                KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.PRIJAVA, zaPrijavu);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor  so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if(!so.isUspesno())
            throw new Exception(so.getPoruka());
        return (Korisnik)so.getOdgovor();
    }

    public Korisnik registracijaKorisnika(Korisnik zaRegistraciju) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.REGISTRACIJA, zaRegistraciju);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (Korisnik) so.getOdgovor();
    }

    public List<Korisnik> noviPozitivniKorisnici() throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.NOVI_POZITIVNI_KORISNICI, null);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (List<Korisnik>) so.getOdgovor();
    }

    public List<Korisnik> zakasniliPonovniTestKorisnici() throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.ZAKASNILI_PONOVNI_TEST_KORISNICI, null);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (List<Korisnik>) so.getOdgovor();
    }

    public List<Korisnik> pretragaKorisnika(Korisnik zaPretragu) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.PRETRAGA_KORISNIKA, zaPretragu);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (List<Korisnik>) so.getOdgovor();
    }

    public Statistika statistika() throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.STATISTIKA, null);
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (Statistika) so.getOdgovor();
    }

    public Test posaljiTest(Test test) throws Exception {
        KlijentskiZahtev kz = new KlijentskiZahtev(Operacije.SLANJE_TESTA, test);                
        KomunikacijaSaServerom.getInstance().posaljiZahtev(kz);
        ServerskiOdgovor so = KomunikacijaSaServerom.getInstance().primiOdgovor();
        if (!so.isUspesno()) {
            throw new Exception(so.getPoruka());
        }
        return (Test) so.getOdgovor();
    }

}
