import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {
    public static Character firstNonRepeatChar(String s) {

        if (s.isEmpty() || s == null) {

            return null;
        }
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char c:s.toCharArray()){

                freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
            }
        for(char c:s.toCharArray()){
            if(freqMap.get(c)==1){
                return c;
            }
        }
      return null;
    }

    public static void main(String[] args){
        String s="aabbxcz";
        System.out.println(firstNonRepeatChar(s));
    }

}
