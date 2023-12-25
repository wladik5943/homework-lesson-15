import java.util.ArrayList;

public class Task1 {
    public static void task(String str) {
        ArrayList<String> list = new ArrayList<String>();
        String[] arr = str.split("");
        for (String t : arr) {
            if (!list.contains(t)) {
                list.add(t);
            }
        }
        System.out.println(list);
    }
}
