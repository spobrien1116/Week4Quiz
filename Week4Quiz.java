import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week4Quiz {

    public static void main(String[] args) {
        List<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        System.out.println(days.get(4));
        System.out.println(createListWithEveryOtherElement(days));
        Map<String, String> stateLocations = new HashMap<String, String>();
        stateLocations.put("Alabama", "SE");
        stateLocations.put("Alaska", "Furthest NW");
        stateLocations.put("Arizona", "SW");
        stateLocations.put("Washington", "NW");
        stateLocations.put("Maine", "NE");
        stateLocations.put("Florida", "Furthest SE");
        System.out.println(getValuesFromMapWhereKeyStartsWithA(stateLocations));
    }

    public static List<String> createListWithEveryOtherElement(List<String> list) {
        List<String> everyOther= new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                everyOther.add(list.get(i));
            }
        }
        return everyOther;
    }

    public static List<String> getValuesFromMapWhereKeyStartsWithA(Map<String, String> map) {
        List<String> startsWithA = new ArrayList<String>();
        for (String state : map.keySet()) {
            if (state.charAt(0) == 'A') {
                startsWithA.add(map.get(state));
            }
        }
        return startsWithA;
    }
}