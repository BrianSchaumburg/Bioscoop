package domain;

public class Film {
    private String titel;
    private int tijdsduur;
    private int rating;
    private boolean toegelatenVoorKinderen;

    private void setTitel(String titel) {
        if(titel.isBlank())
            throw new IllegalArgumentException("Check de titel na");

        this.titel = titel;
    }

    private void setTijdsduur(int tijdsduur) {
        if(tijdsduur<30 || tijdsduur>240)
            throw new IllegalArgumentException("Check de tijdsduur");

        this.tijdsduur = tijdsduur;
    }

    public void setRating(int rating) {
        if(rating>7 || rating<0)
            throw new IllegalArgumentException("Check de rating na");

        this.rating = rating;
    }

    private void setToegelatenVoorKinderen(boolean toegelatenVoorKinderen) {
        this.toegelatenVoorKinderen = toegelatenVoorKinderen;
    }

    public Film(String titel, int tijdsduur, int rating, boolean toegelatenVoorKinderen) {
       setTitel(titel);
        setRating(rating);
        setTijdsduur(tijdsduur);
        setToegelatenVoorKinderen(toegelatenVoorKinderen);

    }

    public String getTitel() {
        return titel;
    }

    public int getTijdsduur() {
        return tijdsduur;
    }

    public double getRating() {
        return rating;
    }

    public boolean isToegelatenVoorKinderen() {
        return toegelatenVoorKinderen;
    }

    public Film(String titel, int tijdsduur, int rating) {
        setTitel(titel);
        setTijdsduur(tijdsduur);
        setRating(rating);
        toegelatenVoorKinderen = true;
    }
public void verhogenRating() {
   if(rating+ 1 >7)
    rating++;
}
public void verhogenRating(int verhoging)
{if(verhoging<=0 || rating+verhoging>7)
    throw new IllegalArgumentException("De rating wordt hoger dan 7 of de paramter is kleiner dan 0 ");
    rating+=verhoging;

}
public void verlagingRating()
{if(rating - 1 >0)
    rating--;
    else
        throw new IllegalArgumentException("Kan de methode niet uitvoeren");
}
public void verlagingRating(int getal)
{if(getal<0 || rating - getal <0)
    throw new IllegalArgumentException("Check de parameter");
    rating-=getal;
}
public boolean hogerteTijdsduur(Film film)
{
    if(film == null)
        throw new NullPointerException("Check de film na");
    if (this.tijdsduur >film.getTijdsduur()) {
        return true;

    }
    return false;
}
    public String convertieTijdsduur()
    {
     int uren= tijdsduur/60;
     int minuten = tijdsduur-uren*60;
     return uren  + "h " + minuten + "m";
    }
    public String convertieToegelatenVoorKinderen()
    {
        if(toegelatenVoorKinderen )
            return "KT";
        return "12+";

    }
    @Override
    public String toString() {
       String sterren = "" ;
        for (int i = 0; i < rating; i ++ ) {
          sterren+="*";
        }

        return this.titel + " " + sterren + "\n" + "duur: " + convertieTijdsduur() + "\n" + this.convertieToegelatenVoorKinderen() + "\n";

    }

}
