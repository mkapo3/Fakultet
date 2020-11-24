package ba.unsa.etf.rpr.zadaca2.fakultet;

public class Predmet {
    private String naziv_predmeta;
    private Integer ECTS_bodovi;
    private boolean obaveznost_predmeta;
    private Profesor profesor;
    private int broj_casova_godisnje;

    public Predmet(String naziv_predmeta, Integer ECTS_bodovi, boolean obaveznsost_predmeta,
                   Profesor profesor, Integer broj_casova_godisnje) {
        this.naziv_predmeta = naziv_predmeta;
        this.ECTS_bodovi = ECTS_bodovi;
        this.obaveznost_predmeta = obaveznost_predmeta;
        this.profesor=profesor;
        this.broj_casova_godisnje=broj_casova_godisnje;
    }


    public Integer getBroj_casova_godisnje() {
        return broj_casova_godisnje;
    }

    public Integer getECTS_bodovi() {
        return ECTS_bodovi;
    }

    public String getNaziv_predmeta() {
        return naziv_predmeta;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public boolean jeliPredmetObavezan() {
        return obaveznost_predmeta;
    }

}
