import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        int totalOperations = 0;
        for (int i = 0; i < 100; i++) {
            String newString = (i % 10) + "";
            strings.add(newString);
            totalOperations += newString.length();
        }

        String s = String.join("", strings);
        totalOperations += s.length();

        System.out.println(s);
        System.out.println(totalOperations);
    }
}
