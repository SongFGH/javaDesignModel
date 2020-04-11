package responsibilitychain;

public class PurchaseRequest {
    private int type;
    private int number;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        super();
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
