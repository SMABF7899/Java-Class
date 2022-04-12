package tamrin6;

import java.time.LocalDate;

public class Payments {
    private String name;
    private Commodity commodity;
    private LocalDate date;

    public Payments(String name, Commodity commodity, LocalDate date) {
        this.name = name;
        this.commodity = commodity;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public LocalDate getDate() {
        return date;
    }
}
