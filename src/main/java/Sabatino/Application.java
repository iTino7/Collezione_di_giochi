package Sabatino;

import Sabatino.entitites.Collezione;
import Sabatino.entitites.Genere;
import Sabatino.entitites.GiochiDaTavolo.GiocoDaTavolo;
import Sabatino.entitites.Gioco;
import Sabatino.entitites.videogiochi.Videogioco;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Gioco> collezione = new ArrayList<>();
        collezione.add(new Videogioco(1, "Horizon forbidden west", 2021, 69.99, "PS5", 25, Genere.AZIONE));
        collezione.add(new Videogioco(2, "Fifa 25", 2025, 79.99, "Xbox", 300, Genere.SPORT));
        collezione.add(new GiocoDaTavolo(3, "Sherlock Holmes", 2021, 40, 2, 60));

        for (Gioco gioco : collezione) {
            gioco.stampaInfo();
        }

        collezione.forEach(System.out::println);

        Collezione collezione1 = new Collezione();

        collezione1.addGames(new Videogioco(1, "Horizon forbidden west", 2021, 69.99, "PS5", 25, Genere.AZIONE));
        collezione1.addGames(new Videogioco(2, "Fifa 25", 2025, 79.99, "Xbox", 300, Genere.SPORT));
        collezione1.addGames(new GiocoDaTavolo(3, "Sherlock Holmes", 2021, 40, 2, 60));


        System.out.println("Giochi con prezzo inferiore ai 70€");
        collezione1.searchPrice(70).forEach(System.out::println);

    }
}
