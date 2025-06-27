package Sabatino.entitites;

public abstract class Gioco {
    private long id;
    private String title;
    private int year;
    private double price;

    public Gioco(long id, String title, int year, double price) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Il prezzo deve essere positivo");

        this.price = price;
    }

    public abstract void stampaInfo();

    @Override
    public String toString() {
        return "Gioco{" +
                "id=" + id +
                ", titolo='" + title + '\'' +
                ", anno= " + year +
                ", prezzo= " + price +
                
                "}";
    }


}
