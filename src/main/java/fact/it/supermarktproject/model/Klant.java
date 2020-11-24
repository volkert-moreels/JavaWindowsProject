package fact.it.supermarktproject.model;

import java.util.ArrayList;

//Volkert Moreels r0784098
public class Klant extends Persoon{
    private ArrayList<String> boodschappenlijst = new ArrayList<>();
    private int klantenkaartnr = -1;
    public Klant(String voornaam,String familienaam){
        super(voornaam,familienaam);
    }

    public ArrayList<String> getBoodschappenlijst() {
        return boodschappenlijst;
    }

    public void setBoodschappenlijst(ArrayList<String> boodschappenlijst) {
        this.boodschappenlijst = boodschappenlijst;
    }

    public int getKlantenkaartnr() {
        return klantenkaartnr;
    }

    public void setKlantenkaartnr(int klantenkaartnr) {
        this.klantenkaartnr = klantenkaartnr;
    }
    public int getAantalOpBoodschappenlijst(){
        return boodschappenlijst.size();
    }
    public boolean voegToeAanBoodschappenlijst(String product){
        if(getAantalOpBoodschappenlijst() <= 4){
            boodschappenlijst.add(product);
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Klant " + super.toString() + " met klantenkaartnr " + klantenkaartnr;
    }
}
