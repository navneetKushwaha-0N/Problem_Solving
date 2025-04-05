import java.util.HashMap;
import java.util.Map;

public class pair2{
    public static void main(String[] args) {
        String s = "Hello";
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println(map);
    }
}
