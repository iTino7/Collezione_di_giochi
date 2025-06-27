package Sabatino.entitites.GiochiDaTavolo;

import Sabatino.entitites.Gioco;

public class GiocoDaTavolo extends Gioco {
    private int numPlayers;
    private int minutes;

    public GiocoDaTavolo(long id, String title, int year, double price, int numPlayers, int minutes) {
        super(id, title, year, price);
        this.numPlayers = numPlayers;
        this.minutes = minutes;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public void stampaInfo() {
        System.out.println("Gioco da tavolo: " + getTitle() + " (" + getYear() + ") - " +
                numPlayers + " giocatori, Durata: " + minutes +
                " min, Prezzo: €" + getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + " [Gioco da Tavolo - giocatori: " + numPlayers + "]";
    }
}
