package extractsuperclass.beforechange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department {
    private String name;

    private List<Employee> staff = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public int getTotalAnnualCost() {
        int result = 0;

        Iterator<Employee> dataIter = this.getStaff();

        while (dataIter.hasNext()) {
            Employee empInfo = dataIter.next();
            result += empInfo.getAnnualCost();
        }

        return result;
    }

    public Iterator<Employee> getStaff() {
        return staff.iterator();
    }

    public void addStaff(Employee arg) {
        staff.add(arg);
    }
}
