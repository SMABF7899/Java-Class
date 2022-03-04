package tamrin6;

public class Commodity {
    private int id;
    private String type;
    private String brand;
    private String model;
    private int number;
    private int price;

    public Commodity(int id, String type, String brand, String model, int number, int price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.number = number;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
