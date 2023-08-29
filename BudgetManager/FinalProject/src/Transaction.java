import java.io.*;

public class Transaction implements Serializable {
    private int id;

    private static int counter = 1;

    //private static final long serialVersionUID = 1L;

    private String type;
    private double moneyAmount;
    private String category;

    public Transaction(String type, double moneyAmount, String category) {
        this.id = counter++;
        this.type = type;
        this.moneyAmount = moneyAmount;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public String getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", moneyAmount=" + moneyAmount +
                ", category='" + category + '\'' +
                '}';
    }
}
