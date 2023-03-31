package formtemplatemethod.afterchange;
import java.util.ArrayList;
import java.util.List;

public abstract class Customer {

    private String name;

    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    protected double countTotalAmount() {
        double totalAmount = 0;

        for (Rental each : rentals) {
            totalAmount += each.countAmount();
        }

        return totalAmount;
    }

    public List<Rental> getRentals() {
        return rentals;
    }
}
