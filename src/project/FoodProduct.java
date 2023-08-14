package project;

public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(int id, String name, double price, String expirationDate) {
        super(id, name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public FoodProduct ( int id, String name, double price ) {
        super ( id, name, price );
    }

    @Override
    public int getId () {
        return super.getId ( );
    }

    @Override
    public void setId ( int id ) {
        super.setId ( id );
    }

    @Override
    public String getName () {
        return super.getName ( );
    }

    @Override
    public void setName ( String name ) {
        super.setName ( name );
    }

    @Override
    public double getPrice () {
        return super.getPrice ( );
    }

    @Override
    public void setPrice ( double price ) {
        super.setPrice ( price );
    }

    @Override
    public String toString () {
        return super.toString ( );
    }
}
