

import java.util.HashMap;
import java.util.Map;

public class StringCompressor {
    public static void conertString(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //System.out.println(map);
        map.forEach((key, value) -> System.out.print(key + "" + value));

    }

    public static void main(String[] args) {
        
        StringCompressor com=new StringCompressor();
        com.conertString("aabbbycyyc");
    }

}
