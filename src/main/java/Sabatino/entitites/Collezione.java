package Sabatino.entitites;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collezione {
    private List<Gioco> giochi = new ArrayList<>();

    public void addGames(Gioco gioco) {
        giochi.add(gioco);
    }

    public List<Gioco> searchPrice(double maxPrice) {
        return giochi.stream().filter(g -> g.getPrice() <= maxPrice).collect(Collectors.toList());
    }

    public List<Gioco> getGiochi() {
        return giochi;
    }
}
