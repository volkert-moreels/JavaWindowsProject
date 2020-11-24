package fact.it.supermarktproject.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Volkert Moreels r0784098
public class Personeelslid extends Persoon{
    private LocalDate inDienstSinds = LocalDate.now();
    public Personeelslid(String voornaam,String familienaam){
        super(voornaam, familienaam);
    }

    public LocalDate getInDienstSinds() {
        return inDienstSinds;
    }

    public void setInDienstSinds(LocalDate inDienstSind) {
        this.inDienstSinds = inDienstSind;
    }

    public String toString() {
        return "Personeelslid " + super.toString() + " is in dienst sinds " + inDienstSinds.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) ;
    }
}
