package fact.it.supermarktproject.model;
// Volkert Moreels r0784098
public class Afdeling {
    private Personeelslid personeelslid;
    private String naam;
    private String foto;
    private boolean gekoeld;
    public Afdeling(){}
    public Afdeling(String naam){
        this.naam = naam;
    }

    public Personeelslid getVerantwoordelijke() {
        return personeelslid;
    }

    public void setVerantwoordelijke(Personeelslid verantwoordelijke) {
        this.personeelslid = verantwoordelijke;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isGekoeld() {
        return gekoeld;
    }

    public void setGekoeld(boolean gekoeld) {
        this.gekoeld = gekoeld;
    }
}
