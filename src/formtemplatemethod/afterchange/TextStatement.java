package formtemplatemethod.afterchange;

public class TextStatement extends Statement {

    @Override
    public String getHead(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String getBody(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + each.countAmount() + "\n";
    }

    @Override
    public String getEnd(Customer customer) {
        int frequentRenterPoints = this.frequentRenterPointCount(customer);
        String result = " Amount owed is " + customer.countTotalAmount() + "\n";
        result += " You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}
