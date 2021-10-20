package domain;

import java.util.ArrayList;

public class Bioscoop {
    private String naam = "Bios ";
    private ArrayList<Film> films = new ArrayList<>();
    public Bioscoop(String naam)
    {
        if(naam.isBlank())
        throw new NullPointerException("Check de naam");
        this.naam.concat(naam);
    }

    public String getNaam() {
        return naam;
    }
    public int aantalFilms()
    {
        return films.size();
    }

    public void toevoegenFilm(Film film) {
        if (film == null) {
            throw new IllegalArgumentException("Check de paramter");
        }
        if (films.size() > 5) {
            throw new IllegalStateException("de lijst zit al vol");
        }
        films.add(film);

    }
    public Film langsteFilm()
    {Film returnfilm  = null;
       int tijdsduur = 0;
       for(int i = 0; i < films.size(); i ++ )
       {
           if (tijdsduur < films.get(i).getTijdsduur()) {
               tijdsduur = films.get(i).getTijdsduur();
           }
       }
        for (int i = 0; i < films.size(); i++) {
            if(tijdsduur == films.get(i).getTijdsduur())
            {
                returnfilm = films.get(i);
                break;
            }
        }
        return returnfilm;
    }
    public int aantalKinderFilms()
    {int aantal = 0;
       for(int i = 0; i < films.size(); i ++ )
       {
           if (films.get(i).isToegelatenVoorKinderen()) {
               aantal++;
           }
       }
       return aantal;
    }
    public String printenFilms()
    {
       String uitvoer = "" ;
        for (int i = 0; i < films.size(); i++) {
            uitvoer+=films.get(i).toString() + "\n" ;
        }
        return uitvoer;
    }
    @Override
    public String toString() {
       return "Bioscoop "  +this.naam + "\n" + "Er zijn momenteel " + aantalFilms() + " beschikbaar. \n" + printenFilms() ;
    }
}
