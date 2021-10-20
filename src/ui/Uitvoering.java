package ui;

import domain.Bioscoop;
import domain.Film;

public class Uitvoering {
    public static void main(String[] args) {
        Bioscoop bioscoop  = new Bioscoop("Proximus");
        Film filma= new Film("filma", 50,4,true);
        Film filmb = new Film("filmb", 70,3,true);
        Film filmc = new Film("filmc", 80,2,true);
        Film filmd = new Film("filmd", 120,1,true);
        Film filme = new Film("filme", 110,4,false);
        Film filmf = new Film("filmf", 60,4,false);
        bioscoop.toevoegenFilm(filma);
        bioscoop.toevoegenFilm(filmb);
        bioscoop.toevoegenFilm(filmc);
        bioscoop.toevoegenFilm(filmd);
        bioscoop.toevoegenFilm(filme);

        bioscoop.toevoegenFilm(filmf);
        System.out.println(bioscoop.toString());
        System.out.println("De langste film is : \n" + bioscoop.langsteFilm());
        System.out.println("Het aantal films die kindvriendelijk zijn : " + bioscoop
                .aantalKinderFilms());

    }

}
