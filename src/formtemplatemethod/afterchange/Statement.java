package formtemplatemethod.afterchange;

public abstract class Statement {

    public String value(Customer customer) {

        String result = this.getHead(customer);
        for (Rental each : customer.getRentals()) {
            result += this.getBody(each);
        }
        result += getEnd(customer);
        return result;
    }

    protected int frequentRenterPointCount(Customer customer) {
        int frequentRenterPoints = 0;
        for (Rental each : customer.getRentals()) {
            // 积分计算的方法
            frequentRenterPoints += each.frequentRenterCount();
        }

        return frequentRenterPoints;
    }

    protected abstract String getHead(Customer customer);

    protected abstract String getBody(Rental customer);

    protected abstract String getEnd(Customer customer);
}
