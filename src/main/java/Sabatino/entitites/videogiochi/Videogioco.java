package Sabatino.entitites.videogiochi;

import Sabatino.entitites.Genere;
import Sabatino.entitites.Gioco;

public class Videogioco extends Gioco {
    private String platform;
    private int hoursGame;
    private Genere genre;

    public Videogioco(long id, String title, int year, double price, String platform, int hoursGame, Genere genre) {
        super(id, title, year, price);
        this.platform = platform;
        this.hoursGame = hoursGame;
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public int getHoursGame() {
        return hoursGame;
    }

    public Genere getGenre() {
        return genre;
    }

    @Override
    public void stampaInfo() {
        System.out.println("Videogioco: " + getTitle() + " (" + getYear() + ") - "
                + platform + ", Genere: " + genre
                + ", Durata: " + hoursGame
                + " ore, Prezzo: €"
                + getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + " [Videgioco - piattaforma: " + platform + ", genere: " + genre + "]";
    }


}
