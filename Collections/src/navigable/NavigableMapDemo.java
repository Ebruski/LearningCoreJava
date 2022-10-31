package navigable;

import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("Z", "Zip");
        map.put("Y", "Yat");
        map.put("X", "Xmas");
        map.put("W", "Weight");
        map.put("V", "Value");

        System.out.println(map.floorKey("V"));
        System.out.println(map.lowerKey("W"));
        System.out.println(map.ceilingKey("X"));
        System.out.println(map.higherKey("Y"));
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map.descendingMap());
    }
}
