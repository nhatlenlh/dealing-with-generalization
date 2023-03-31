package formtemplatemethod.beforechange;
import java.util.ArrayList;
import java.util.List;

public class Customer {

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
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            frequentRenterPoints += each.frequentRenterCount();

            result += "\t" + each.getMovie().getTitle() + "\t" + each.countAmount() + "\n";
        }

        result += " Amount owed is " + countTotalAmount() + "\n";
        result += " You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        int frequentRenterPoints = 0;
        String result = "<H1>Rental Record for <EM> " + getName() + "</EM><H1><P>n";
        for (Rental each : rentals) {
            frequentRenterPoints += each.frequentRenterCount();

            result += "\t" + each.getMovie().getTitle() + "\t" + each.countAmount() + "<BR>\n";
        }

        result += "<P> Amount owed is <EM>" + countTotalAmount() + "</EM><P>\n";
        result += " You earned <EM>" + frequentRenterPoints + " </EM> frequent renter points <P>";
        return result;
    }

    private double countTotalAmount() {
        double totalAmount = 0;

        for (Rental each : rentals) {
            totalAmount += each.countAmount();
        }

        return totalAmount;
    }
}