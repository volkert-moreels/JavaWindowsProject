package fact.it.supermarktproject.model;

import java.util.ArrayList;

// Volkert Moreels r0784098
public class Supermarkt {
private ArrayList<Afdeling> afdelingen = new ArrayList<>();
private String naam;
private int aantalKlanten;
public Supermarkt(String naam){
    this.naam = naam;
}

    public ArrayList<Afdeling> getAfdelingen() {
        return afdelingen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
public int getAantalAfdelingen(){
    return afdelingen.size();
}
public void voegAfdelingToe(Afdeling afdeling){
    afdelingen.add(afdeling);
}
public Afdeling zoekAfdelingOpNaam(String naam){
    for (Afdeling afdeling:afdelingen) {
        if(afdeling.getNaam() == naam){
            return afdeling;
        }
    }
    return null;
}
public void registreerKlant(Klant klant){
    aantalKlanten = aantalKlanten + 1;
    klant.setKlantenkaartnr(aantalKlanten);
}
}
