package ba.unsa.etf.rpr.zadaca2.fakultet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String ime;
    private String prezime;
    private Integer broj_indeksa;
    private HashMap<Predmet, Integer> studentovi_predmeti;

    public void dodajPredmetStudentu(Predmet predmet){
        studentovi_predmeti.put(predmet,1);
    }




}
