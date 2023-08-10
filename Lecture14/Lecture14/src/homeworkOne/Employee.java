package homeworkOne;

import java.util.List;

public class Employee {
    private List<String> names;

    public Employee(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}
