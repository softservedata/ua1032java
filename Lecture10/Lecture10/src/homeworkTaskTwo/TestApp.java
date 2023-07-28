package homeworkTaskTwo;

/* Create a map called personMap and populate it with ten entries of type <String, String>,
where each entry corresponds to a person's last name and first name.
Display the contents of the map on the screen.
Are there at least two persons with the same first name among these ten people?
Remove the person from the map whose first name is "Orest" (or any other specified name).
Print the resulting map after the removal. */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestApp {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Iryna", "Vdovych");
        personMap.put("Roman", "Zozulia");
        personMap.put("Daria", "Shevchuk");
        personMap.put("Ihor", "Shevchuk");
        personMap.put("Nadia", "Koval");
        personMap.put("Romann", "Kovall");
        personMap.put("Orest", "Koval");
        personMap.put("Olha", "Vdovych");
        personMap.put("Maria", "Lozynska");
        personMap.put("Oleg", "Smiths");

        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        boolean hasDuplicate = findSameFirstName(personMap);
        System.out.println("\nAre there at least two persons with the same first name? \n" + hasDuplicate);

        removePerson(personMap, "Iryna");

        System.out.println("\nMap after removing name: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getValue() + ", First Name: " + entry.getKey());
        }
    }

    public static boolean findSameFirstName(Map<String, String> personMap) {
        Map<String, Integer> countMap = new HashMap<>();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            String firstName = entry.getKey();
            countMap.put(firstName, countMap.getOrDefault(firstName, 0) + 1);
        }
        for (int count : countMap.values()) {
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    public static void removePerson(Map<String, String> personMap, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals(firstName)) {
                iterator.remove();
            }
        }
    }
}
