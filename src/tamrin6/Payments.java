package tamrin6;

import java.time.LocalDate;

public class Payments {
    private String username;
    private Commodity commodity;
    private LocalDate date;

    public Payments(String username, Commodity commodity, LocalDate date) {
        this.username = username;
        this.commodity = commodity;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public LocalDate getDate() {
        return date;
    }
}
