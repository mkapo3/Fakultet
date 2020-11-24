package ba.unsa.etf.rpr.zadaca2.fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private  String ime;
    private String prezime;
    private List<Predmet> predmeti;
    private int norma;

    public Profesor(String ime,String prezime, ArrayList<Predmet> predmeti) {
        this.ime = ime;
        this.prezime=prezime;
        this.predmeti=predmeti;
        norma=predmeti.stream().map(Predmet::getBroj_casova_godisnje).
                reduce(0 , (a,b) -> a+b);
    }
    public void dodajPredmetProfesoru(Predmet predmet){
        predmeti.add(predmet);
        norma=norma+predmet.getBroj_casova_godisnje();
    }
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public List<Predmet> getPredmeti() {
        return predmeti;
    }
    public int getNorma() {
        return norma;
    }
}
